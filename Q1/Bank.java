// Run this file. Output: 4000.0, 2500.0, 4000.0
public class Bank {
    public static void main(String[] args) {
        Account a = new SavingsAccount();
        System.out.println(a.fee(200000));
        System.out.println(a.fee(200000, true));
        System.out.println(a.fee(200000, false));
    }
}
