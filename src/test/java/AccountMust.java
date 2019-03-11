import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class AccountMust {
    private FakeStatementRepository statementRepository = new FakeStatementRepository();
    private Account account = new Account();

    @Test
    public void add_statement_to_repository_when_making_a_deposit() {
        account.deposit(new Money(100));
        assertThat(statementRepository.statements(), containsString("100 2019/03/10"));
    }
}
