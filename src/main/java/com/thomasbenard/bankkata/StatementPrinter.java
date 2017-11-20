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
        for (int i = transactions.size() - 1; i >= 0; i--) {
            String statement = createStatement(transactions, i);
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
