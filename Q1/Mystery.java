// Q1 d) - mystery() and the number of calls
public class Mystery {
    static int calls = 0;    // counts how many times mystery() is called

    public static int mystery(int k) {
        calls++;
        return (k <= 1) ? k : mystery(k - 1) + mystery(k - 2);
    }

    public static void main(String[] args) {
        System.out.println("mystery(4) = " + mystery(4));   // 3
        System.out.println("Number of calls = " + calls);   // 9
    }
}
