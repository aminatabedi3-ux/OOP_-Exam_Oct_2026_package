// Test file for question 3 (the exam does not ask for a main here)
public class Q3Test {
    public static void main(String[] args) {
        // Q3 c) two valid ways to create an object stored in an Account variable
        // Account acc = new Account(1000);   // ERROR: Account is abstract

        Account acc1 = new FixedDeposit(100000);          // way 1: concrete subclass

        Account acc2 = new Account(50000) {               // way 2: anonymous class
            @Override
            public void close() {
                System.out.println("Account closed");
            }
        };

        acc1.close();
        acc2.close();
        System.out.println("Interest acc1: " + acc1.interest());   // 0.0
        System.out.println("Interest acc2: " + acc2.interest());   // 2500.0

        Shape s = new Circle(2);
        s.describe();
    }
}
