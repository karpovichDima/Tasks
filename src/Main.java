import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

            boolean virgule = false;
            int iP1Int = 0;
            int iP2Int = 0;

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите предложение");
            String input = sc.nextLine();

            int counter = 0;
            int inpLen = input.length();

            List<String> list = new ArrayList<>();

            if(inpLen != 0){
                counter++;
                for (int i = 0; i < inpLen;i++) {
                    virgule = false;
                    boolean print = true;
                    switch (input.charAt(i)){
                        case ' ':
                            print = false;
                            counter++;
                            virgule = true;
                            System.out.println();
                            break;
                        case ',':
                            print = false;
                            if (input.charAt(i+1) == ' ') i = i + 1;
                            counter++;
                            virgule = true;
                            System.out.println();
                            break;
                    }
                    if (print) System.out.print(input.charAt(i));

                    if (virgule){
                        iP2Int = i;
                        if (iP2Int - iP1Int > 0){
                            list.add(wordGenerator(iP1Int, iP2Int, input));
                            iP1Int = iP2Int;
                        }
                    }
                }
            }
            System.out.println('\n' + "Вы ввели " + counter + " слов");

            list.sort(Comparator.comparingInt(String::length));

            for (String s : list) {
                System.out.println(s);
            }
        }

        private static String wordGenerator(int iP1Int, int iP2Int, String input) {

            String wordV;
            char[] word = new char[((input.length()) - (input.length() - (iP2Int - iP1Int)))];

            for (int n = 0, i = iP1Int+1; i < iP2Int; n++, i++){
                word[n] = input.charAt(i);
            }

            wordV = String.copyValueOf(word);

            return wordV;
        }
    }