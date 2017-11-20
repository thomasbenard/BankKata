package com.thomasbenard.bankkata;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock {

    private static final SimpleDateFormat DD_MM_YYYY = new SimpleDateFormat("dd/MM/yyyy");

    public String todayAsString() {
        return DD_MM_YYYY.format(today());
    }

    protected Date today() {
        return new GregorianCalendar().getTime();
    }
}
