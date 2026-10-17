// Q1 b) - overloading and overriding
public class Account {
    double fee(double amount) {
        return 1000;
    }

    double fee(double amount, boolean express) {
        return express ? 2500 : fee(amount);
    }
}
