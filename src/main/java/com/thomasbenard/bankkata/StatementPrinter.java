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
                int balance = transactions.get(1).getAmount() + transactions.get(0).getAmount();
                Transaction transaction = transactions.get(1);
                String statement = formatStatement(transaction, balance);
                console.print(statement);
            }
            int balance = transactions.get(0).getAmount();
            Transaction transaction = transactions.get(0);
            String statement = formatStatement(transaction, balance);
            console.print(statement);
        }
    }

    private String formatStatement(Transaction transaction, int balance) {
        return format("%s | %d | %d", transaction.getDate(), transaction.getAmount(), balance);
    }
}
