package Task2;

import java.util.Scanner;

public class Calc {

    private static Scanner in;
    private static float value1;
    private static float value2;

    public static void main(String[] args) {

        Action action;

        System.out.println("Введите два числа");
        valid();

        action = (x,y)->x+y;
        System.out.println("Сумма чисел " + action.calculate(value1, value2));

        action = (x,y)-> {
            if (x > y) return x - y;
            if (y > x) return y - x;
        return 0;};
        System.out.println("Разность чисел " + action.calculate(value1, value2));

        action = (x,y)->x/gcd(x,y) * y;
        System.out.println( "НОК " + action.calculate(value1,value2));
    }

    private static void valid() {
        in = new Scanner(System.in);

        while(!in.hasNextFloat()) {
            System.out.println("Ошибка ввода, надо вводить числа ");
            in.next();
        }
        value1 = in.nextFloat();

        while(!in.hasNextFloat()) {
            System.out.println("Ошибка ввода, надо вводить числа ");
            in.next();
        }
        value2 = in.nextFloat();
    }

    private static float gcd(float a,float b){

        if (b==0){
            System.out.println("НОД " + a);
            return a;
        } else {
            return gcd(b,a % b);
        }
    }
}

interface Action{
    float calculate(float x, float y);
}