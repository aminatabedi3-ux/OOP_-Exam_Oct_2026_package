// Q1 a) (i) and (iii) - Kampala Car Hire
// NOTE: in the Word answer these classes are called Vehicle, Car and Motorcycle.
// Here they are called RentalVehicle, RentalCar and RentalMotorcycle because
// the same folder also contains the Vehicle/Car/Taxi classes of question 1 e).
public class RentalVehicle {
    String numberPlate;
    double dailyRate;

    public RentalVehicle(String numberPlate, double dailyRate) {
        this.numberPlate = numberPlate;
        this.dailyRate = dailyRate;
    }

    // charge for a number of days
    public double calculateCharge(int days) {
        return dailyRate * days;
    }
}
