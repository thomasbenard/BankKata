package com.thomasbenard.bankkata;

public class Deposit extends Statement {

    public Deposit(Money amount, Date date) {
        super(amount, date);
    }

    @Override
    protected String name() {
        return "DEPOSIT";
    }

    @Override
    Money computeNewBalance(Money oldBalance) {
        return oldBalance.plus(amount());
    }

}
