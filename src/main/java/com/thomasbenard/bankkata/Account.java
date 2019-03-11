package com.thomasbenard.bankkata;

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
}
