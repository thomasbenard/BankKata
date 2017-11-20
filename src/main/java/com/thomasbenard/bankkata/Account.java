package com.thomasbenard.bankkata;

import java.util.List;

public class Account {
    private final TransactionRepository transactionRepository;
    private final StatementPrinter statementPrinter;

    public Account(TransactionRepository transactionRepository, StatementPrinter statementPrinter) {
        this.transactionRepository = transactionRepository;
        this.statementPrinter = statementPrinter;
    }

    public void deposit(int amount) {
        transactionRepository.addDeposit(amount);
    }

    public void withdraw(int amount) {
        transactionRepository.addWithdrawal(amount);
    }

    public void printStatements() {
        List<Transaction> transactions = transactionRepository.allTransactions();
        statementPrinter.print(transactions);
    }
}
