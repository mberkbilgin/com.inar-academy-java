package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list:");
        int number = input.nextInt();
        int[] list = new int[number];
        fillTheList(list);
        partitionOfList(list);

    }

    public static void partitionOfList(int[] list) {
        int[] newList = new int[list.length];
        int k = 0;
        int l = (newList.length / 2) + 1;
        newList[newList.length / 2] = findTheMid(list);
        for (int i = list.length - 1; i >= 0; i--) {
            if (i == list.length / 2) {
                continue;
            }
            if (list[i] <= newList[newList.length / 2]) {
                newList[k] = list[i];
                k++;
            } else {
                newList[l] = list[i];
                l++;
            }
        }
        System.out.println("After the partition, the list is " + Arrays.toString(newList));
    }

    public static int findTheMid(int[] list) {
        Arrays.sort(list);
        return list[list.length / 2];
    }

    public static void fillTheList(int[] list) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }
}
