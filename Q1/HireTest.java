// Test for Q1 a): run this file
public class HireTest {
    public static void main(String[] args) {
        RentalVehicle car = new RentalCar("UAB 123C", 100000, 5);
        RentalVehicle bike = new RentalMotorcycle("UEA 456D", 40000, 150);

        System.out.println("Car for 3 days: UGX " + car.calculateCharge(3));        // 300000.0
        System.out.println("Motorcycle for 3 days: UGX " + bike.calculateCharge(3)); // 125000.0
    }
}
