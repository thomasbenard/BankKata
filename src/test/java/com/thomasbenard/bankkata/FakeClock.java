package com.thomasbenard.bankkata;

class FakeClock implements Clock {
    private Date today;

    FakeClock(Date today) {
        this.today = today;
    }

    void setDate(Date date) {
        today = date;
    }

    @Override
    public Date today() {
        return today;
    }
}
