package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_26 {
    public static void main(String[] args) {
        int[] list1 = new int[5];
        System.out.println("Enter numbers for list1:");
        fillTheArray(list1);
        int[] list2 = new int[5];
        System.out.println("Enter numbers for list2:");
        fillTheArray(list2);
        System.out.println((equals(list1,list2))?"Two lists are strictly identical":"Two lists are not strictly identical");
    }
    public static boolean equals(int[] list1, int[] list2){
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void fillTheArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

}


