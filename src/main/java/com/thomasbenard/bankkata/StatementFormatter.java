package com.thomasbenard.bankkata;

import java.util.List;

import static java.util.stream.Collectors.toList;

class StatementFormatter {

    private Money balance = new Money(0);

    StatementFormatter() {
    }

    List<String> format(List<Statement> statements) {
        return statements.stream().map(statement -> {
            balance = statement.computeNewBalance(balance);
            return statement.print(balance);
        }).collect(toList());
    }
}
