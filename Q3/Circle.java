// Q3 e) - concrete subclass of Shape
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");          // call the parent constructor
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
