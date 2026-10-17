import java.util.Scanner;

public class SchoolRegister {

    static Scanner sc = new Scanner(System.in);

    static String[] names;
    static String[] regNos;
    static String[] subjects;
    static String[] classes;
    static double[] marks;
    static int count = 0;      // number of registered students

    // 1. Log in
    static boolean login() {
        String correctUser = "teacher";
        String correctPass = "12345";

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Username: ");
            String user = sc.nextLine();
            System.out.print("Password: ");
            String pass = sc.nextLine();

            if (user.equals(correctUser) && pass.equals(correctPass)) {
                System.out.println("Login successful.");
                return true;
            }
            System.out.println("Wrong username or password.");
        }
        return false;
    }

    // 2. Register students
    static void registerStudents() {
        System.out.print("How many students do you want to register? ");
        int n = Integer.parseInt(sc.nextLine());

        names = new String[n];
        regNos = new String[n];
        subjects = new String[n];
        classes = new String[n];
        marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.nextLine();
            System.out.print("Registration number: ");
            regNos[i] = sc.nextLine();
            System.out.print("Subject: ");
            subjects[i] = sc.nextLine();
            System.out.print("Class: ");
            classes[i] = sc.nextLine();
            count++;
        }
    }

    // 3. Record marks
    static void recordMarks() {
        if (count == 0) {
            System.out.println("Register students first.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.print("Enter marks for " + names[i] + ": ");
            marks[i] = Double.parseDouble(sc.nextLine());
        }
    }

    // 4. Show all students and their marks
    static void showAll() {
        if (count == 0) {
            System.out.println("No students registered.");
            return;
        }
        System.out.println("Name | RegNo | Subject | Class | Marks");
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + " | " + regNos[i] + " | "
                + subjects[i] + " | " + classes[i] + " | " + marks[i]);
        }
    }

    public static void main(String[] args) {
        if (login()) {
            registerStudents();
            recordMarks();
            showAll();
        } else {
            System.out.println("Access denied.");
        }
    }
}
