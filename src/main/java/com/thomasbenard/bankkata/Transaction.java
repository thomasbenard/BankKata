package com.thomasbenard.bankkata;

class Transaction {
    private final String date;
    private final int amount;

    Transaction(String date, int amount) {
        this.date = date;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        return amount == that.amount && (date != null ? date.equals(that.date) : that.date == null);
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + amount;
        return result;
    }

    String getDate() {
        return date;
    }

    int getAmount() {
        return amount;
    }
}
