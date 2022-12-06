package chapters.extra;

import java.util.ArrayList;
import java.util.Scanner;

public class E07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers");
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() != 10){
            int number = input.nextInt();
            list.add(number);
        }
        System.out.println(list.toString());
        reverse(list);
    }

    private static void reverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
