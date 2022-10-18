package chapters.chapter07.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[12];
        fillTheArr(arr);
        System.out.println("Enter a year:");
        int number = input.nextInt();
        System.out.println(arr[number % 12]);

    }

    public static void fillTheArr(String[] arr) {
        arr[0] = "monkey";
        arr[1] = "rooster";
        arr[2] = "dog";
        arr[3] = "pig";
        arr[4] = "rat";
        arr[5] = "ox";
        arr[6] = "tiger";
        arr[7] = "rabbit";
        arr[8] = "dragon";
        arr[9] = "snake";
        arr[10] = "horse";
        arr[11] = "ship";

    }
}
