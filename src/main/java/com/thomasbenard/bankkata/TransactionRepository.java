package com.thomasbenard.bankkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class TransactionRepository {
    private final Clock clock;
    private List<Transaction> transactions = new ArrayList<>();

    public TransactionRepository(Clock clock) {
        this.clock = clock;
    }

    void addDeposit(int amount) {
        Transaction deposit = new Transaction("18/11/2017", 100);
        transactions.add(deposit);
    }

    void addWithdrawal(int amount) {
        throw new NotImplementedException();
    }

    List<Transaction> allTransactions() {
        return transactions;
    }
}
