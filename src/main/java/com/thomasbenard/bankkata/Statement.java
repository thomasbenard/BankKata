package com.thomasbenard.bankkata;

public abstract class Statement {
    private static final String SEPARATOR = " ";
    private final Money amount;
    private final Date date;

    Statement(Money amount, Date date) {

        this.amount = amount;
        this.date = date;
    }

    String print() {
        return detail() + SEPARATOR + balance().amount();
    }

    Money amount() {
        return amount;
    }

    Date date() {
        return date;
    }

    private String detail() {
        return name() + SEPARATOR + amount().amount() + SEPARATOR + date().format();
    }

    protected abstract Money balance();

    protected abstract String name();
}
