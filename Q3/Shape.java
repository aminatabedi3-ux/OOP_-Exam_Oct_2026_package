// Q3 d) - abstract class with two abstract methods
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();         // abstract method 1
    public abstract double perimeter();    // abstract method 2

    public void describe() {
        System.out.println(name + " area = " + area() + ", perimeter = " + perimeter());
    }
}
