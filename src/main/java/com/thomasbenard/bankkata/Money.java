package com.thomasbenard.bankkata;

class Money {
    private final double amount;

    Money(double amount) {
        this.amount = amount;
    }

    double amount() {
        return amount;
    }

    Money plus(Money money) {
        return new Money(amount + money.amount);
    }

    Money minus(Money money) {
        return new Money(amount - money.amount);
    }
}
