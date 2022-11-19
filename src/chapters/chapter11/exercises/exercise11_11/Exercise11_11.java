package chapters.chapter11.exercises.exercise11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 integer numbers");
        fillTheArr(list);
        display(list);
        sort(list);
        display(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void fillTheArr(ArrayList<Integer> list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list.add(number);
        }
    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
