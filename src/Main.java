public class Main {
    public static Transport createObject(String className) {
        switch (className) {
            case "2nd":
                return new Car("Mercedes", 2015, "Car", "Diesel");
            case "3rd":
                return new Truck("Tesla Truck", 2020, "Truck", 40.5);
            case "4th":
                return new Plane("Boeing", 2017, "Airplane", 100);
            default:
                System.out.println("Invalid class name.");
                return null;
        }
    }
    public static void main(String[] args) {
        Transport car = createObject("2nd");
        Transport truck = createObject("3rd");
        Transport plane = createObject("4th");

        Transport[] printable = {car, truck, plane};

        for (int i = 0; i < printable.length; i++) {
            printable[i].print();
            System.out.println();
        }
    }
}