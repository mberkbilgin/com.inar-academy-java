package chapters.chapter07.Listings;

import java.util.Scanner;

public class Listing07_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value that you find:");
        int key = input.nextInt();
        int[] arr = new int[10];
        fillTheArray(arr);
        System.out.println(key+" number's index is "+linearSearch(arr,key));
    }

    public static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public static int linearSearch(int[] list, int key) {
         for (int i = 0; i < list.length; i++) {
             if (key == list[i])
                return i;
            }
        return -1;
    }
}

