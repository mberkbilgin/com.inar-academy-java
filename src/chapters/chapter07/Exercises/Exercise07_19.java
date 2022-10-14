package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list");
        int num = input.nextInt();
        int[] list = new int[num];
        fillTheList(list);
        System.out.println(Arrays.toString(list));
        if (isSort(list)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }

    public static boolean isSort(int[] list) {
        int[] list2 = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            list2[i] = list[i];
        }
        Arrays.sort(list2);
        for (int i = 0; i < list.length; i++) {
            if (list[i] != list2[i]){
                return false;
            }
        }
        return true;
    }

    public static void fillTheList(int[] list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }
}
