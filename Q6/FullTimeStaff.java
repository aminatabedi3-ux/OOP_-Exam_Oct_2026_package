import java.util.Scanner;

public class FullTimeStaff extends Staff {
    private double basicSalary;
    private double nssfRate = 0.05;    // 5% (ASSUMED - change to your course rate)
    private double payeRate = 0.10;    // 10% (ASSUMED - change to your course rate)

    public FullTimeStaff(String no, String name, int age, double basicSalary) {
        super(no, name, age);
        this.basicSalary = basicSalary;
    }

    public double netPay() {
        double deductions = basicSalary * (nssfRate + payeRate);
        return basicSalary - deductions;
    }

    @Override
    public void display() {
        super.display();                       // print number, name, age
        System.out.println("Net monthly pay: " + netPay());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Staff No: ");
        String no = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Basic salary: ");
        double salary = sc.nextDouble();

        FullTimeStaff f = new FullTimeStaff(no, name, age, salary);
        f.display();
    }
}
