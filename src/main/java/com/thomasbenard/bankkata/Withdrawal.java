package com.thomasbenard.bankkata;

class Withdrawal extends Statement {
    Withdrawal(Money amount, Date date) {
        super(amount, date);
    }

    @Override
    protected Money balance() {
        return new Money(-amount().amount());
    }

    @Override
    protected String name() {
        return "WITHDRAWAL";
    }
}
