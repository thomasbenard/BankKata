package com.thomasbenard.bankkata;

import java.util.List;

import static java.lang.String.format;

public class StatementPrinter {

    private static final String HEADER = "DATE | AMOUNT | BALANCE";
    private final Console console;

    public StatementPrinter(Console console) {
        this.console = console;
    }

    void print(List<Transaction> transactions) {
        console.print(HEADER);
        if (!transactions.isEmpty()) {
            if (transactions.size() == 2) {
                String statement = createStatement(transactions, 1);
                console.print(statement);
            }
            String statement = createStatement(transactions, 0);
            console.print(statement);
        }
    }

    private int computeBalance(List<Transaction> transactions, int index) {
        if (index == 0)
            return transactions.get(0).getAmount();
        return transactions.get(1).getAmount() + transactions.get(0).getAmount();
    }

    private String createStatement(List<Transaction> transactions, int index) {
        int balance = computeBalance(transactions, index);
        Transaction transaction = transactions.get(index);
        return formatStatement(transaction, balance);
    }

    private String formatStatement(Transaction transaction, int balance) {
        return format("%s | %d | %d", transaction.getDate(), transaction.getAmount(), balance);
    }
}
