package com.thomasbenard.bankkata;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClockTest {

    private final Clock clock = new TestableClock();

    @Test
    public void returns_the_date_as_string() throws Exception {
        assertThat(clock.todayAsString(), is("17/11/2017"));
    }

    private class TestableClock extends Clock {
        @Override
        protected Date today() {
            return new GregorianCalendar(2017, Calendar.NOVEMBER, 17).getTime();
        }
    }
}