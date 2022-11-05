package chapters.chapter07.listings;

import java.util.Arrays;
import java.util.Scanner;

public class Listing07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of items");
        int number = input.nextInt();
        int[] arr = new int[number];
        System.out.println("Enter "+number+" numbers");
        fillInTheArray(arr);
        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(isUpToAverage(arr[i], arr)){
                count++;
            }
        }
        System.out.println("Average is "+averageForArray(arr));
        System.out.println("Number of greater than average numbers is "+count);

    }
    public static void fillInTheArray(int[] arr){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    public static double averageForArray(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = sum / (arr.length);
        return average;
    }
   public static boolean isUpToAverage(int i, int[] arr){
        if(i > averageForArray(arr)){
            return true;
        }else
            return false;
    }
}
