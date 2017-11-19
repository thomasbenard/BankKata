package com.thomasbenard.bankkata;

import java.util.List;

public class StatementPrinter {
    private final Console console;

    public StatementPrinter(Console console) {
        this.console = console;
    }

    void print(List<Transaction> transactions) {
        console.print("DATE | AMOUNT | BALANCE");
    }
}
