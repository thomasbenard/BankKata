package com.thomasbenard.bankkata;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Account {
    private final TransactionRepository transactionRepository;

    public Account(TransactionRepository transactionRepository) {

        this.transactionRepository = transactionRepository;
    }

    public void deposit(int amount) {
        transactionRepository.addDeposit(amount);
    }

    public void withdraw(int amount) {
        throw new NotImplementedException();
    }

    public void printStatements() {
        throw new NotImplementedException();
    }
}
