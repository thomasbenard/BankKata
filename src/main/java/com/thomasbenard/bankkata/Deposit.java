package com.thomasbenard.bankkata;

public class Deposit extends Statement {

    public Deposit(Money amount, Date date) {
        super(amount, date);
    }

    @Override
    protected Money balance() {
        return amount();
    }

    @Override
    protected String name() {
        return "DEPOSIT";
    }
}
