package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1");
        int number = input.nextInt();
        int[] list1 = new int[number];
        fillTheArr(list1);
        System.out.println("Enter list2");
        number = input.nextInt();
        int[] list2 = new int[number];
        fillTheArr(list2);
        System.out.println("The merged list is " +Arrays.toString(merge(list1,list2)));
    }
    public static int[] merge(int[] list1, int[] list2){
        int number = list1.length + list2.length;
        int[] newList = new int[number];
        for (int i = 0; i < list1.length; i++) {
            newList[i] = list1[i];
        }
        for (int i = list1.length, j = 0; i < newList.length; i++, j++) {
            newList[i] = list2[j];
        }
        Arrays.sort(newList);
        return newList;
    }

    public static void fillTheArr(int[] list1) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
    }
}
