package com.thomasbenard.bankkata;

class FakeStatementRepository implements StatementRepository {

    private Money deposit;
    private Date date;

    String statements() {
        return deposit.amount() + " " + date.format();
    }

    @Override
    public void addDeposit(Money amount, Date date) {
        deposit = amount;
        this.date = date;
    }

}
