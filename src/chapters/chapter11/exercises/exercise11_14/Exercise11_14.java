package chapters.chapter11.exercises.exercise11_14;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("Enter five integers for list1");
        fillTheArr(list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter five integers for list2");
        fillTheArr(list2);
        list1.addAll(list2);
        System.out.println("The combined list is ");
        display(list1);
    }


    private static void display(ArrayList<Integer> list1) {
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
    }

    public static void fillTheArr(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        while (list.size() != 5) {
            int number = input.nextInt();
            list.add(number);
        }
    }

}
