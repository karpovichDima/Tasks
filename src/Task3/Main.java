package Task3;

import java.util.Scanner;

public class Main {
    private static Scanner in;

    public static void main(String[] args) {
        boolean flagS = false;
        in = new Scanner(System.in);

        System.out.print("Введите число: ");
        valid();

        int age = in.nextInt();
        if (age <= 0) {
            System.out.println("Надо было вводить числа, больше нуля");
        } else {
            checkVal(age, flagS);
        }
    }

    private static void checkVal(int age, boolean flagS) {
        if (age % 2 == 0) {
            System.out.println("Число " + age + " является четным");
        } else {
            System.out.println("Число " + age + " является нечетным");
        }

        for(int i = 2; i < age - 1; ++i) {
            if (age % i == 0 && !flagS) {
                flagS = true;
                System.out.println("Число составное");
            }
        }

        if (!flagS) {
            System.out.println("Число простое");
        }
    }

    private static void valid() {
        while(!in.hasNextInt()) {
            System.out.println("Ошибка ввода, число не целое");
            in.next();
        }
    }
}
