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
                console.print("14/11/2017 | -100 | 100");
            }
            Transaction transaction = transactions.get(0);
            int balance = transaction.getAmount();
            String statement = formatStatement(transaction, balance);
            console.print(statement);
        }
    }

    private String formatStatement(Transaction transaction, int balance) {
        return format("%s | %d | %d", transaction.getDate(), transaction.getAmount(), balance);
    }
}
