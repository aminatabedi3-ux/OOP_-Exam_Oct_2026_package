public class RentalCar extends RentalVehicle {
    int seats;    // field only for a car

    public RentalCar(String numberPlate, double dailyRate, int seats) {
        super(numberPlate, dailyRate);
        this.seats = seats;
    }
    // uses calculateCharge() from RentalVehicle: dailyRate * days
}
