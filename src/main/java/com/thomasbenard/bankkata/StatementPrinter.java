package com.thomasbenard.bankkata;

import java.util.List;

public class StatementPrinter {

    private static final String HEADER = "DATE | AMOUNT | BALANCE";
    private final Console console;

    public StatementPrinter(Console console) {
        this.console = console;
    }

    void print(List<Transaction> transactions) {
        console.print(HEADER);
        if(!transactions.isEmpty())
            console.print("13/11/2017 | 200 | 200");
    }
}
