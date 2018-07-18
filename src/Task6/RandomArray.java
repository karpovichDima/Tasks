package Task6;

import java.util.*;

public class RandomArray {

    private static Scanner in;

    public static void main(String[] args) {

        Random rnd = new Random(System.currentTimeMillis());
        List<Integer> list = new ArrayList<>();
        in = new Scanner(System.in);

        System.out.println("Введите длину массива");
        valid();
        int lengthsArr = in.nextInt();

        fillingArr(lengthsArr, list, rnd);
        outputArr(lengthsArr, list);

        list.sort(Comparator.comparing(Object::toString));

        System.out.println("Min: " +  list.get(0) + " Max: " + list.get(lengthsArr - 1));
    }

    private static void outputArr(int lengthsArr, List<Integer> list) {
        for (int i = 0; i <= lengthsArr - 1; i++){
            System.out.print(list.get(i) + " ");
        }
    }

    private static void fillingArr(int lengthsArr, List<Integer> list, Random rnd) {
        int number;
        for (int i = 0; i <= lengthsArr - 1; i++){
            number = 10 + rnd.nextInt(99 - 10 + 1);
            list.add(number);
        }
    }

    private static void valid() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }
}