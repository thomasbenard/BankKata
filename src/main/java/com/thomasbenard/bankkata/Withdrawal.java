package com.thomasbenard.bankkata;

class Withdrawal extends Statement {
    Withdrawal(Money amount, Date date) {
        super(amount, date);
    }

    @Override
    protected String name() {
        return "WITHDRAWAL";
    }

    @Override
    Money computeNewBalance(Money oldBalance) {
        return oldBalance.minus(amount());
    }
}
