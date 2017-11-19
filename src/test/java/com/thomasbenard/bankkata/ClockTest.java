package com.thomasbenard.bankkata;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClockTest {

    private final Clock clock = new Clock();

    @Test
    public void returns_the_date_as_string() throws Exception {
        assertThat(clock.todayAsString(), is("17/11/2017"));
    }
}