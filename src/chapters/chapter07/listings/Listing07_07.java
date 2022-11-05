package chapters.chapter07.listings;

import java.util.Arrays;
import java.util.Scanner;

public class Listing07_07 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        fillTheArray(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value that you find");
        int key = input.nextInt();
        System.out.println("The index is "+binarySearch(arr,key));

    }
    public static int binarySearch(int[] arr,int key){
       int start = 0;
       int end = arr.length-1;
       while (start <= end){
           int mid = ((end - start) / 2) + start;
           if(key == arr[mid]){
               return mid;
            } else if(key < arr[mid]){
               end = mid - 1;
           }else {
               start = mid + 1;
            }
        }
        return -1;
    }
    public static void fillTheArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }
    }
}
