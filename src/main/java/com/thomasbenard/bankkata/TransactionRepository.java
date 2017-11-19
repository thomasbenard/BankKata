package com.thomasbenard.bankkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class TransactionRepository {
    private final Clock clock;

    public TransactionRepository(Clock clock) {
        this.clock = clock;
    }

    void addDeposit(int amount) {
        throw new NotImplementedException();
    }

    void addWithdrawal(int amount) {
        throw new NotImplementedException();
    }

    List<Transaction> allTransactions() {
        throw new NotImplementedException();
    }
}
