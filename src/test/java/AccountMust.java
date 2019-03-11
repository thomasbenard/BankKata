import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountMust {
    private FakeStatementRepository statementRepository = new FakeStatementRepository();
    private Account account = new Account(statementRepository);

    @Test
    public void add_statement_to_repository_when_making_a_deposit_of_100() {
        account.deposit(new Money(100));
        assertThat(statementRepository.statements(), containsString("100.0 2019/03/10"));
    }

    @Test
    public void add_statement_to_repository_when_making_a_deposit_of_1000() {
        account.deposit(new Money(1000));
        assertThat(statementRepository.statements(), containsString("1000.0 2019/03/10"));
    }
}
