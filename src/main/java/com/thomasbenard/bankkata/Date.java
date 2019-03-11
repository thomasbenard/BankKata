package com.thomasbenard.bankkata;

import java.time.Month;

class Date {
    private final int year;
    private final Month month;
    private final int dayOfTheMonth;

    Date(int year, Month month, int dayOfTheMonth) {
        this.year = year;
        this.month = month;
        this.dayOfTheMonth = dayOfTheMonth;
    }

    String format() {
        String separator = "/";
        String monthString = month.getValue() >= 10 ? String.valueOf(month.getValue()) : "0" + month.getValue();
        return year + separator + monthString + separator + dayOfTheMonth;
    }
}
