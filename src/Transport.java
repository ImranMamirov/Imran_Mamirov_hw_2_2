public class Transport implements Printable {
    private String brand;
    private int year;
    private String typeOfTransport;

    public Transport(String brand, int year, String typeOfTransport) {
        this.brand = brand;
        this.year = year;
        this.typeOfTransport = typeOfTransport;
    }

    @Override
    public void print() {
        System.out.println("Brand: " + brand +
                "\nYear: " + year +
                "\nType of transport: " + typeOfTransport);
    }
}
