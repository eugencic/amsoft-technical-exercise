public class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, int quantity, String brand, String model) {
        super(name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
