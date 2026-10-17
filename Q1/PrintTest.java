// Test for Q1 c)
public class PrintTest {
    public static void main(String[] args) {
        Printable p1 = new Invoice();
        Printable p2 = new Employee();
        p1.printReceipt();
        p2.printReceipt();
    }
}
