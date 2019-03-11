package com.thomasbenard.bankkata;

import org.junit.Test;

import java.time.Month;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class AccountMust {
    private FakeClock clock = new FakeClock(new Date(2019, Month.MARCH, 10));
    private StatementRepository statementRepository = new InMemoryStatementRepository();
    private Account account = new Account(statementRepository, clock);

    @Test
    public void format_all_statements_given_several_transactions() {
        account.deposit(new Money(100));
        clock.setDate(new Date(2019, Month.MARCH, 11));
        account.withdraw(new Money(25));
        assertThat(account.statements(), contains("DEPOSIT 100.0 2019/03/10 100.0", "WITHDRAWAL 25.0 2019/03/11 75.0"));
    }
}
