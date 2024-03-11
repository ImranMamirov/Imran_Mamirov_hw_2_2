public class Truck extends Transport {
    private double capacity;

    public Truck(String brand, int year, String typeOfTransport, double capacity) {
        super(brand, year, typeOfTransport);
        this.capacity = capacity;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Load capacity: " + capacity);
    }
}
