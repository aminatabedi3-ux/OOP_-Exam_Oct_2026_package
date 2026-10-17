// Output: Drives on four wheels / Picks up passengers / The vehicle moves / Cars 2
// Change the condition to  v.getClass() == Car.class  to get "Cars 1"
public class Fleet {
    public static void main(String[] args) {
        Vehicle[] list = { new Car(), new Taxi(), new Vehicle() };
        int cars = 0;
        for (Vehicle v : list) {
            System.out.println(v.move());
            if (v instanceof Car) cars++;
        }
        System.out.println("Cars " + cars);
    }
}
