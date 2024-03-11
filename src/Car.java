public class Car extends Transport {
    private String fuelType;

    public Car(String brand, int year, String typeOfTransport, String fuelType) {
        super(brand, year, typeOfTransport);
        this.fuelType = fuelType;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Fuel Type: " + fuelType);
    }
}
