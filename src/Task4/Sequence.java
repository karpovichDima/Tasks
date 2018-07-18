package Task4;

import java.util.Scanner;

public class Sequence {
    private static Scanner in;

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Введите число, до которого пойдет цикл: ");
        valid();
        int border = in.nextInt();
        int sum = 0;
        comput(border, sum);
    }

    private static void comput(int border, int sum) {
        for (int i = 1; i <= border; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println("\nСумма чисел равна: " + sum);
    }

    private static void valid() {
        while (!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }
}