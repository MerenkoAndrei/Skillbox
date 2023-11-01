package ObjectsAndClasses_Methods.Class_Methods;

import java.util.Scanner;

public class Arithmetic {
    private int one;
    private int too;

    public Arithmetic(int one, int too) {
        this.one = one;
        this.too = too;
    }

    public static void main(String[] args) {
        int one = new Scanner(System.in).nextInt();
        int too = new Scanner(System.in).nextInt();
        Homework arithmetic = new Homework(one, too);
        Homework.CalculationsHomework ctr = arithmetic.new CalculationsHomework();
        ctr.showInfo(one, too);
    }
}

class Homework extends Arithmetic {
    public Homework(int one, int too) {
        super(one, too);
    }

    class CalculationsHomework {
        public int sumOfNumbers(int one, int too) {
            return one + too;
        }

        public int productsOfNumbers(int one, int too) {
            return one * too;
        }

        public int maximumOfTwoNumbers(int one, int too) {
            return one > too ? one : too;
        }

        public int minimumOfTwoNumbers(int one, int too) {
            return one < too ? one : too;
        }

        public void showInfo(int one, int too) {
            System.out.print("Сумма чисел one и too равна : ");
            System.out.println(sumOfNumbers(one, too));
            System.out.print("Произведение чисел one и too равно : ");
            System.out.println(productsOfNumbers(one, too));
            System.out.print("Максимальное значение из двух чисел one и too равно : ");
            System.out.println(maximumOfTwoNumbers(one, too));
            System.out.print("Минимальное значение из двух чисел one и too равно : ");
            System.out.println(minimumOfTwoNumbers(one, too));
        }
    }
}
