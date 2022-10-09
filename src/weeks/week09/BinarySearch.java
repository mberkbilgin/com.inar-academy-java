package weeks.week09;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];
        fillArrWithRandomValues(arr,0,100);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Please enter the number you want to find:");
        int num = input.nextInt();
        int index = getTheIndexWithBinarySearch(arr,num);
        System.out.println("The number "+num+" is index "+index);
    }

    public static int getTheIndexWithBinarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = ((end - start) / 2) + start;
            if (num < arr[mid]) {
                end = mid - 1;
            } else if (num > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
            return -1;

    }

    public static void fillArrWithRandomValues(int[] arr,int start, int limit) {
        for (int i = 0; i < arr.length; i++) {
            int num = start + (int)(Math.random()* (limit -start));
            arr[i] = num;
            }
    }
}
