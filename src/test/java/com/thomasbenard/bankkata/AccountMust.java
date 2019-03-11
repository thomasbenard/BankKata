package com.thomasbenard.bankkata;

import org.junit.Test;

import java.time.Month;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountMust {
    private FakeClock clock = new FakeClock(new Date(2019, Month.MARCH, 10));
    private FakeStatementRepository statementRepository = new FakeStatementRepository();
    private Account account = new Account(statementRepository, clock);

    @Test
    public void add_statement_to_repository_when_making_a_deposit() {
        account.deposit(new Money(100));
        assertThat(statementRepository.statements(), containsString("100.0 2019/03/10"));
    }

}
