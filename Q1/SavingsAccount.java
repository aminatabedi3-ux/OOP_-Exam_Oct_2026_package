public class SavingsAccount extends Account {
    @Override
    double fee(double amount) {
        return amount * 0.02;
    }
}
