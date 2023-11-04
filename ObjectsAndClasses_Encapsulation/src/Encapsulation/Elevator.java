package Encapsulation;

import java.util.Scanner;
public class Elevator {
    private static int currentFloor = 1;
    private final int minFloor;
    private final int maxFloor;
    private int floor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void getCurrentFloor() {
        System.out.println("Вы находитесь на: " + move(currentFloor) + " этаже");
    }

    private int moveDown() {

        return currentFloor--;
    }

    private int moveUp() {
        return currentFloor++;
    }

    public int move(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            if (floor < currentFloor && floor >= minFloor) {
                for (; floor != currentFloor; moveDown()) {
                    System.out.println(currentFloor + "этаж");
                }
            } else if (floor > currentFloor && floor <= maxFloor) {
                for (; floor != currentFloor; moveUp()) {
                    System.out.println(currentFloor + "этаж");
                }
            }
        } else {
            System.out.println("Ошибка!!!Не верно указан этаж!!");
        }
        return currentFloor;
    }

    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("___________________");
            System.out.print("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
            elevator.getCurrentFloor();
        }
    }
}

