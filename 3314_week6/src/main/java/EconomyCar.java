import java.util.ArrayList;

class EconomyCar extends CarAbstract {
    public EconomyCar(String brand, String model, String licensePlate, double basePrice, ArrayList<String> additionalFeatures) {
        super(brand, model, licensePlate, 50, additionalFeatures);
    }
    private static final double HYBRID_PRICE = 10;

    @Override
    public double calculateTotalPrice(int day) {
        double TotalPrice = basePrice * day;
        if (additionalFeatures.contains("Hyrid")){
            TotalPrice += HYBRID_PRICE;
        }
        return TotalPrice;
    }

}
