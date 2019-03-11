
class FakeStatementRepository implements StatementRepository {

    private Money deposit;

    String statements() {
        return deposit.amount() + " 2019/03/10";
    }

    @Override
    public void addDeposit(Money amount) {
        deposit = amount;
    }
}
