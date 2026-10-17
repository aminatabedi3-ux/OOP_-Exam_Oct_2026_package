import java.util.Scanner;

public class PartTimeStaff extends Staff {
    private int hoursWorked;
    private double ratePerHour = 10;     // property of the class (USD)
    private double taxRate = 0.30;       // 30% tax

    public PartTimeStaff(String no, String name, int age, int hoursWorked) {
        super(no, name, age);
        this.hoursWorked = hoursWorked;
    }

    public double netPay() {
        double totalPay = hoursWorked * ratePerHour;
        double tax = totalPay * taxRate;
        return totalPay - tax;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Net monthly pay: USD " + netPay());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Staff No: ");
        String no = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Hours worked: ");
        int hours = sc.nextInt();

        PartTimeStaff p = new PartTimeStaff(no, name, age, hours);
        p.display();
    }
}
