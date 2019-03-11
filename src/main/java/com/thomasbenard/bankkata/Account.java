package com.thomasbenard.bankkata;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private StatementRepository statementRepository;
    private Clock clock;

    public Account(StatementRepository statementRepository, Clock clock) {
        this.statementRepository = statementRepository;
        this.clock = clock;
    }

    void deposit(Money money) {
        statementRepository.addDeposit(money, clock.today());
    }

    void withdraw(Money money) {
        statementRepository.addWithdrawal(money, clock.today());
    }

    List<String> statements() {
        List<String> statementMessages = new ArrayList<>();
        List<Statement> statements = statementRepository.allStatements();
        Money balance = new Money(0);
        for (Statement statement : statements) {
            balance = statement.computeNewBalance(balance);
            statementMessages.add(statement.print(balance));
        }
        return statementMessages;
    }
}
