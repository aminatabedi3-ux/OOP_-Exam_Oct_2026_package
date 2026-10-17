public class RentalMotorcycle extends RentalVehicle {
    int engineSize;    // field only for a motorcycle

    public RentalMotorcycle(String numberPlate, double dailyRate, int engineSize) {
        super(numberPlate, dailyRate);
        this.engineSize = engineSize;
    }

    @Override
    public double calculateCharge(int days) {
        return dailyRate * days + 5000;    // helmet fee UGX 5,000
    }
}
