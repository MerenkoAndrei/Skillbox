public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 1, 2, 0.5);
        basket.add("Luk", 1, 1, 1.5);
        basket.add("ogurcy", 1, 2, 2.5);
        basket.print("Milk");
        System.out.println("Price: " + basket.getTotalPrice());
        System.out.println("Weight: " + basket.getTotalWeight());

    }
}
