package Task9;

import java.util.Scanner;

public class PollindromStr {

    public static void main(String[] args) {

        boolean flagFind = true;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: " + "\n");

        String word = in.nextLine();
        int len = word.length();
        char[] wordChar = word.toCharArray();

        for(int i = 0; i < len/2; ++i)
        {
            if(wordChar[i] != wordChar[len-i-1])
            {
                flagFind = false;
            }
        }

        if (flagFind) {
            System.out.println("Полиндром ");
        } else {
            System.out.println("Не полиндром ");
        }
    }
}