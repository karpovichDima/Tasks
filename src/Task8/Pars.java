package Task8;

import java.util.Scanner;

public class Pars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите предложение");
        String message = sc.nextLine();
        System.out.println("Введите слово");
        String word = sc.nextLine();

        int count = parser(message, word);
        System.out.println("Количество раз: " + count);
    }

    private static int parser(String string, String word) {

        string = string.toLowerCase();
        word = word.toLowerCase();
        int i = string.indexOf(word);
        int counter = 0;
        while (i >= 0) {
            counter++;
            i = string.indexOf(word, i + 1);
        }
        return counter;
    }
}