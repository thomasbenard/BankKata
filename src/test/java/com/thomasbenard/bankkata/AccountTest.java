package com.thomasbenard.bankkata;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccountTest {

    private TransactionRepository transactionRepository = mock(TransactionRepository.class);
    private final Account account = new Account();

    @Test
    public void stores_a_deposit() throws Exception {
        account.deposit(100);
        verify(transactionRepository).addDeposit(100);
    }
}
