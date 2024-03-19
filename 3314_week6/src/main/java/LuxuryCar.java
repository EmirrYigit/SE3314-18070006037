import java.util.ArrayList;

class LuxuryCar extends CarAbstract {
    public LuxuryCar(String brand, String model, String licensePlate, double basePrice, ArrayList<String> additionalFeatures) {
        super(brand, model, licensePlate, 100, additionalFeatures);
    }
    private static double GPS_PRICE = 20;
    public static double LEATHER_SEATS_PRICE = 30;

    @Override
    public double calculateTotalPrice(int day) {
            double TotalPrice = basePrice * day;
            TotalPrice += GPS_PRICE + LEATHER_SEATS_PRICE;
            return TotalPrice;
    }
}

