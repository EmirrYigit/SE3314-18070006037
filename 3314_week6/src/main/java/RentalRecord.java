public class RentalRecord {
    private CarAbstract car;
    private int rentalPeriod;
    private double rentalPrice;
    private String lessor;

    public RentalRecord(CarAbstract car, int rentalPeriod, double rentalPrice, String lessor) {
        this.car = car;
        this.rentalPeriod = rentalPeriod;
        this.rentalPrice = rentalPrice;
        this.lessor = lessor;
    }

    public CarAbstract getCar() {
        return car;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public String getLessor() {
        return lessor;
    }
}
