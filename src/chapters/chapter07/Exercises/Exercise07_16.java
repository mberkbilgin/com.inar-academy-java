package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SIZE = 100000;
        int[] arr = new int[SIZE];
        fillTheArray(arr,SIZE);
        System.out.println("Enter the number that you find:");
        int key = input.nextInt();
        System.out.println("LINEAR SEARCH");
        long startTime = System.currentTimeMillis();
        int index = linearSearch(arr,key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;


        System.out.println("The execution time is " + executionTime + " milliseconds");
        System.out.println("The number you find is " + index +". index in the array");
        System.out.println("------------------------------------------------");


        System.out.println("BINARY SEARCH");
        startTime = System.currentTimeMillis();
        Arrays.sort(arr);
        int index2 = binarySearch(arr, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;

        System.out.println("The execution time is " + executionTime + " milliseconds");
        System.out.println("The number you find is " + index2 +". index in the array");
    }
    public static int binarySearch(int[] numbers, int key) {
        int low = 0;
        int high = numbers.length;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > numbers[mid]) {
                low = mid + 1;
            } else if (key == numbers[mid]) {
                return mid;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void fillTheArray(int[] arr,int SIZE) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*SIZE);
        }
    }
}
