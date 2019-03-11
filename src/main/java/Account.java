public class Account {
    private StatementRepository statementRepository;

    public Account(StatementRepository statementRepository) {

        this.statementRepository = statementRepository;
    }

    void deposit(Money money) {
        statementRepository.addDeposit(money);
    }
}
