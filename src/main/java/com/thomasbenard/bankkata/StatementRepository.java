package com.thomasbenard.bankkata;

public interface StatementRepository {
    void addDeposit(Money amount, Date date);

    void addWithdrawal(Money amount, Date date);
}
