package com.thomasbenard.bankkata.acceptance;

import com.thomasbenard.bankkata.Account;
import com.thomasbenard.bankkata.Console;
import com.thomasbenard.bankkata.StatementPrinter;
import com.thomasbenard.bankkata.TransactionRepository;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

public class PrintStatementsAcceptanceTest {

    private Console console = mock(Console.class);
    private TransactionRepository transactionRepository = new TransactionRepository();
    private StatementPrinter statementPrinter = new StatementPrinter();
    private Account account = new Account(transactionRepository, statementPrinter);

    @Test
    public void print_all_transactions_in_reverse_chronological_order_and_with_good_balance() throws Exception {
        // Given ...
        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);

        // When ...
        account.printStatements();

        // Then ...
        InOrder inOrder = inOrder(console);
        inOrder.verify(console).print("DATE | AMOUNT | BALANCE");
        inOrder.verify(console).print("14/11/2017 | -500 | 2500");
        inOrder.verify(console).print("13/11/2017 | 2000 | 3000");
        inOrder.verify(console).print("10/11/2017 | 1000 | 1000");
        inOrder.verifyNoMoreInteractions();
    }
}
