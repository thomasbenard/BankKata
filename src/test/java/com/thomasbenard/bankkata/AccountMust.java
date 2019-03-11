package com.thomasbenard.bankkata;

import org.junit.Test;

import java.time.Month;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class AccountMust {
    private FakeClock clock = new FakeClock(new Date(2019, Month.MARCH, 10));
    private FakeStatementRepository statementRepository = new FakeStatementRepository();
    private Account account = new Account(statementRepository, clock);

    @Test
    public void add_statement_to_repository_when_making_a_deposit() {
        account.deposit(new Money(100));
        assertThat(statementRepository.statements(), containsString("100.0 2019/03/10"));
    }

    @Test
    public void add_statement_to_repository_when_making_a_withdrawal() {
        account.withdraw(new Money(100));
        assertThat(statementRepository.statements(), containsString("-100.0 2019/03/10"));
    }

    @Test
    public void format_statement_given_only_one_deposit() {
        StatementRepository repository = new InMemoryStatementRepository();
        Account account = new Account(repository, clock);
        account.deposit(new Money(100));
        assertThat(account.statements(), contains("DEPOSIT 100.0 2019/03/10 100.0"));
    }

    @Test
    public void format_statement_given_only_one_withdrawal() {
        StatementRepository repository = new InMemoryStatementRepository();
        Account account = new Account(repository, clock);
        account.withdraw(new Money(100));
        assertThat(account.statements(), contains("WITHDRAWAL 100.0 2019/03/10 -100.0"));
    }

    @Test
    public void format_all_statements_given_several_transactions() {
        StatementRepository repository = new InMemoryStatementRepository();
        Account account = new Account(repository, clock);
        account.deposit(new Money(100));
        clock.setDate(new Date(2019, Month.MARCH, 11));
        account.withdraw(new Money(25));
        assertThat(account.statements(), contains("DEPOSIT 100.0 2019/03/10 100.0", "WITHDRAWAL 25.0 2019/03/11 75.0"));
    }
}
