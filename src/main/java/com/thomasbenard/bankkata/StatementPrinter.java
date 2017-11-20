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
        if(!transactions.isEmpty()) {
            Transaction transaction = transactions.get(0);
            String statement = formatStatement(transaction);
            console.print(statement);
        }
    }

    private String formatStatement(Transaction transaction) {
        return format("%s | %d | %d", transaction.getDate(), transaction.getAmount(), transaction.getAmount());
    }
}
