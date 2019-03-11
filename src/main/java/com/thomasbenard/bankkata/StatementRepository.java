package com.thomasbenard.bankkata;

import java.util.List;

public interface StatementRepository {
    void addDeposit(Money amount, Date date);

    void addWithdrawal(Money amount, Date date);

    List<Statement> allStatements();
}
