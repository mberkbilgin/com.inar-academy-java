package chapters.chapter11.exercises.exercise11_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillTheArr(list);
        removeDuplicate(list);
        System.out.print("The distinct integers are ");
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
        System.out.println("Enter ten integers");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);
        }
    }
    public static void removeDuplicate(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)){
                    list.remove(j);
                }
            }
        }
    }

}
