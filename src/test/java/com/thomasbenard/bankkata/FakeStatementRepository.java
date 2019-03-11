package com.thomasbenard.bankkata;

import java.util.List;

class FakeStatementRepository implements StatementRepository {

    private String statement;

    String statements() {
        return statement;
    }

    @Override
    public void addDeposit(Money amount, Date date) {
        statement = amount.amount() + " " + date.format();
    }

    @Override
    public void addWithdrawal(Money amount, Date date) {
        statement = -amount.amount() + " " + date.format();
    }

    @Override
    public List<Statement> allStatements() {
        return null;
    }

}