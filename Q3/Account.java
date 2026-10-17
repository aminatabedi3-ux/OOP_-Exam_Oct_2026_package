// Q3 a) - corrected code
public abstract class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double interest() {            // normal method with a body
        return balance * 0.05;
    }

    public abstract void close();         // abstract: no body
}
