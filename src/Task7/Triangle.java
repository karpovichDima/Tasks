package Task7;

import java.util.Scanner;

public class Triangle {

    private static Scanner in;
    private static double sideA;
    private static double sideB;
    private static double sideC;
    private static final int SQUARE = 2;

    public static void main(String[] args) {

        in = new Scanner(System.in);
        inputAndCheck();

        System.out.println("Строны: a = " + sideA + " b = " + sideB + " c = " + sideC + '\n');

        if (Math.pow(sideA, SQUARE) == Math.pow(sideB, SQUARE) + Math.pow(sideC, SQUARE)
                || (Math.pow(sideB, SQUARE) == Math.pow(sideA, SQUARE) + Math.pow(sideC, SQUARE)
                || (Math.pow(sideC, SQUARE) == Math.pow(sideB, SQUARE) + Math.pow(sideA, SQUARE)))){
            System.out.println("Стороны данных размеров, МОГУТ образовать прямоугольный треугольник");
        } else {
            System.out.println("Треугольник с этими параметра не имеет прямого угла.");
        }
    }

    private static void inputAndCheck() {
        System.out.println("Введите сторону a");
        valid();
        sideA = in.nextDouble();

        System.out.println("Введите сторону b");
        valid();
        sideB = in.nextDouble();

        System.out.println("Введите сторону c");
        valid();
        sideC = in.nextDouble();
    }

    private static void valid() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }
}

