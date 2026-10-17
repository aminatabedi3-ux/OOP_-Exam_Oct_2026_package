// Run this file
public class PayrollTest {
    public static void main(String[] args) {
        Payable[] staff = new Payable[2];
        staff[0] = new SalariedEmployee("S001", "Alice", 2500000);
        staff[1] = new HourlyEmployee("H001", "Brian", 120, 15000);

        double total = 0;
        for (int i = 0; i < staff.length; i++) {
            double pay = staff[i].getPaymentAmount();
            System.out.println(staff[i] + " earns UGX " + pay);
            total = total + pay;
        }
        System.out.println("Total payroll: UGX " + total);
    }
}
