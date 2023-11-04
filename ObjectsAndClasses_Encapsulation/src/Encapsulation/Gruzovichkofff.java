package Encapsulation;

public class Gruzovichkofff {
    private final double dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final String property;
    private final String registrationNumber;
    private final String endurance;

    public Gruzovichkofff(double dimensions, double weight, String deliveryAddress,
                          String property, String registrationNumber, String endurance) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.endurance = endurance;
    }

    @Override
    public String toString() {
        return "Gruzovichkofff{" +
                " Габарит посылки " + dimensions +
                ", Вес посылки = " + weight +
                ", Адрес доставки = '" + deliveryAddress + '\'' +
                ", Можно ли переворачивать = '" + property + '\'' +
                ", Регистрационный номер = '" + registrationNumber + '\'' +
                ", Хрупкость = '" + endurance + '\'' +
                '}';
    }

    public double getDimensions() {
        return dimensions;
    }

    public Gruzovichkofff setDimensions(double dimensions) {
        return new Gruzovichkofff(dimensions, weight, deliveryAddress, property, registrationNumber, endurance);
    }

    public double getWeight() {
        return weight;
    }

    public Gruzovichkofff setWeight(double weight) {
        return new Gruzovichkofff(dimensions, weight, deliveryAddress, property, registrationNumber, endurance);
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Gruzovichkofff setDeliveryAddress(String deliveryAddress) {
        return new Gruzovichkofff(dimensions, weight, deliveryAddress, property, registrationNumber, endurance);
    }

    public String getProperty() {
        return property;
    }

    public Gruzovichkofff setProperty(String property) {
        return new Gruzovichkofff(dimensions, weight, deliveryAddress, property, registrationNumber, endurance);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Gruzovichkofff setRegistrationNumber(String registrationNumber) {
        return new Gruzovichkofff(dimensions, weight, deliveryAddress, property, registrationNumber, endurance);
    }

    public String getEndurance() {
        return endurance;
    }

    public Gruzovichkofff setEndurance(String endurance) {
        return new Gruzovichkofff(dimensions, weight, deliveryAddress, property, registrationNumber, endurance);
    }
}

class Dimensions {
    private double width;
    private double height;
    private double length;


    public double calculatingTheDimension(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
        return width * height * length;
    }

}

class Main {
    public static void main(String[] args) {
        Dimensions DMS = new Dimensions();
        Gruzovichkofff GRF = new Gruzovichkofff(DMS.calculatingTheDimension(10.0, 10.0, 10.0)
                , 10.5, "Sankt-Peterburg", "Не переворачивать",
                "Р463H", "Очень хрупкая");

        System.out.println(GRF);
        System.out.println("___________________________________________________________");

        Gruzovichkofff GRF2 = new Gruzovichkofff(DMS.calculatingTheDimension(10.0, 10.0, 10.0),
                10.0,"Moskva","Не переворачивать","W45646W","Хрупкое"
                );
        System.out.println(GRF2);
        System.out.println("___________________________________________________________");

        Gruzovichkofff copy = new Gruzovichkofff(GRF2.getDimensions(),
                GRF2.getWeight(),
                GRF2.getDeliveryAddress(),
                GRF.getProperty(),
                GRF2.getRegistrationNumber(),
                GRF2.getEndurance());
        System.out.println(copy);

//        GRF.setDimensions(DMS.calculatingTheDimension(10.0, 10.0, 10.0));
//        GRF.setWeight(10.0);
//        GRF.setEndurance("Хрупкое");
//        GRF.setDeliveryAddress("Moskva");
//        GRF.setRegistrationNumber("W45646W");
//        GRF.setProperty("Не переворачивать");



    }
}
