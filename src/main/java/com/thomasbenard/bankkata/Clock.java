package com.thomasbenard.bankkata;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Clock {

    private static final SimpleDateFormat DD_MM_YYYY = new SimpleDateFormat("dd/MM/yyyy");

    String todayAsString() {
        return DD_MM_YYYY.format(today());
    }

    private Date today() {
        return new GregorianCalendar(2017, Calendar.NOVEMBER, 17).getTime();
    }
}
