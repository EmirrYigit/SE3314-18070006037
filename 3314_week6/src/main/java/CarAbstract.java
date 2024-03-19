import java.util.ArrayList;

public abstract class CarAbstract {
    public String brand;
    public String model;
    public String licensePlate;
    public double basePrice;
    ArrayList<String> additionalFeatures;

    public CarAbstract(String brand, String model, String licensePlate, double basePrice, ArrayList<String> additionalFeatures) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.basePrice = basePrice;
        this.additionalFeatures = additionalFeatures;
    }

    public void addFeature(String feature){
        additionalFeatures.add(feature);

    }
    public abstract double calculateTotalPrice(int day);
}
