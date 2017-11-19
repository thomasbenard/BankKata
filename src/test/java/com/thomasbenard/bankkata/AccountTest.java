package com.thomasbenard.bankkata;

import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AccountTest {

    private TransactionRepository transactionRepository = mock(TransactionRepository.class);
    private final Account account = new Account(transactionRepository);

    @Test
    public void stores_a_deposit() throws Exception {
        account.deposit(100);
        verify(transactionRepository).addDeposit(100);
    }

    @Test
    public void stores_a_withdrawal() throws Exception {
        account.withdraw(100);
        verify(transactionRepository).addWithdrawal(100);
    }

    @Test
    public void prints_a_statement() throws Exception {
        List<Transaction> transactions = new ArrayList<>();
        when(transactionRepository.allTransactions()).thenReturn(transactions);
        account.printStatements();
        verify(statementPrinter).print(transactions);
    }
}
