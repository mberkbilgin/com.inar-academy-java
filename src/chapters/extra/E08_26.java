package chapters.extra;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.sort;

/**
  0,15 0,875 0,375
  0,55 0,005 0,225
  0,30 0,12 0,4
 */
public class E08_26 {
    public static void main(String[] args) {
        System.out.println("Enter 3*3 array");
        ArrayList<Double> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        ArrayList<Double> list3 = new ArrayList<>();
        fillList(list1, list2, list3);
        display(list1);
        display(list2);
        display(list3);
    }


    private static void display(ArrayList<Double> list1) {
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }

    private static void fillList(ArrayList<Double> list1, ArrayList<Double> list2, ArrayList<Double> list3) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list1.add(input.nextDouble());
        }
        sort(list1);
        for (int i = 0; i < 3; i++) {
            list2.add(input.nextDouble());
        }
        sort(list2);
        for (int i = 0; i < 3; i++) {
            list3.add(input.nextDouble());
        }
        sort(list3);
    }
}
