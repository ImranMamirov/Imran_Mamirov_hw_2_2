public class Plane extends Transport {
    private int numberOfSeats;

    public Plane(String brand, int year, String typeOfTransport, int numberOfSeats) {
        super(brand, year, typeOfTransport);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of seats: " + numberOfSeats);
    }
}
