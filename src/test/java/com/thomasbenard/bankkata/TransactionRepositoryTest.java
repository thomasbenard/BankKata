package com.thomasbenard.bankkata;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TransactionRepositoryTest {

    private Clock clock = mock(Clock.class);
    private final TransactionRepository transactionRepository = new TransactionRepository(clock);

    @Test
    public void deposit_creates_and_stores_a_deposit_transaction() throws Exception {
        when(clock.todayAsString()).thenReturn("18/11/2017");
        transactionRepository.addDeposit(100);
        List<Transaction> transactions = transactionRepository.allTransactions();
        assertThat(transactions, contains(transaction("18/11/2017", 100)));
    }

    private Transaction transaction(String date, int amount) {
        return new Transaction(date, amount);
    }
}