package com.thomasbenard.bankkata;

import java.util.ArrayList;
import java.util.List;

public class InMemoryStatementRepository implements StatementRepository {
    private List<Statement> statements = new ArrayList<>();

    @Override
    public void addDeposit(Money amount, Date date) {
        statements.add(new Deposit(amount, date));
    }

    @Override
    public void addWithdrawal(Money amount, Date date) {
        statements.add(new Withdrawal(amount, date));
    }

    @Override
    public List<Statement> allStatements() {
        return statements;
    }
}
