package com.thomasbenard.bankkata.acceptance;

import com.thomasbenard.bankkata.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrintStatementsAcceptanceTest {

    private Console console = mock(Console.class);
    private Clock clock = mock(Clock.class);
    private TransactionRepository transactionRepository = new TransactionRepository(clock);
    private StatementPrinter statementPrinter = new StatementPrinter(console);
    private Account account = new Account(transactionRepository, statementPrinter);

    @Before
    public void setUp() throws Exception {
        when(clock.todayAsString()).thenReturn("10/11/2017", "13/11/2017", "14/11/2017");
    }

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
