public class Main {

    public static void main(String[] args) {
        Basket Kate = new Basket();
        Kate.add("Milk", 2, 2, 0.5);
        Kate.add("Luk", 2, 1, 0.5);
        Kate.add("ogurcy", 2, 1, 2.5);
        Kate.print("Корзина Kate");
        System.out.println("______________________________");
        System.out.println("______________________________");
        Basket Maks = new Basket();
        Maks.add("Milk", 2, 1, 0.5);
        Maks.add("Luk0", 2, 1, 0.5);
        Maks.add("ogurcy0", 2, 1, 2.5);
        Maks.print("Корзина Maks");
        System.out.println("\nПродаж за сегодня: " + "\nНа сумму: " + Basket.getTotalPrice() +
                "\nОбщий вес проданных товаров: " + Basket.getTotalWeight() +
                "\nКоличество проданных товаров: " + Basket.getTotalCount());
        System.out.println("______________________________");
        System.out.println("Cредняя цены товара во всех корзинах: " + Basket.average_product_Price());
        System.out.println("______________________________");
        System.out.println("Cредняя стоимость корзины: " + Basket.averageCheck());


    }
}
