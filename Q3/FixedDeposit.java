public class FixedDeposit extends Account {
    public FixedDeposit(double balance) {
        super(balance);
    }

    @Override
    public double interest() {
        return 0.0;
    }

    @Override
    public void close() {
        System.out.println("Fixed deposit closed");
    }
}
