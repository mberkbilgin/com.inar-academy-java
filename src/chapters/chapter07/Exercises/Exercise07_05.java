package chapters.chapter07.Exercises;

import java.util.Scanner;

public class Exercise07_05 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers:");
        fillNumbers(numbers);
        int[] newList = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            if (isThere(numbers, newList, i)) {
                newList[i] = numbers[i];
            }
        }
        displayDistinct(newList);
    }

    public static void displayDistinct(int[] newList) {
        int count = 0;
        String str = "";
        for (int i = 0; i < newList.length; i++) {
            if (newList[i] != 0) {
                count++;
                str += newList[i] + " ";
            }
        }
        System.out.println("The number of distinct number is " + count);

        System.out.println("The distinct numbers are " + str);

    }

    public static boolean isThere(int[] numbers, int[] newList, int i) {
        for (int j = 0; j < newList.length; j++) {
            if (newList[j] == numbers[i]) {
                return false;
            }
        }
        return true;
    }

    public static void distinct(int[] numbers, int[] newList) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < newList.length; j++) {
                if (numbers[i] == newList[j]) {

                }
            }
        }
    }

    public static void fillNumbers(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }
}
