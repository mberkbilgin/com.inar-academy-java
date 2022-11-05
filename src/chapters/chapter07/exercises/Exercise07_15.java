package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_15 {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        int[] numbers = new int[10];
        fillTheArray(numbers);
        int[] distinct = new int[10];
        System.out.print("The distinct number is ");
        for (int i = 0; i < numbers.length; i++) {
            if(isDuplicate(numbers,distinct,i)){
                display(numbers,distinct,i);
            }
        }
    }
    public static void display(int[] numbers,int[] distinct,int i) {
        distinct[i] = numbers[i];
        if(distinct[i] != 0){
            System.out.print(distinct[i] + " ");
        }
    }

    public static boolean isDuplicate(int[] numbers, int[] distinct, int i) {
        for (int j = 0; j < distinct.length; j++) {
            if(numbers[i] == distinct[j]){
                return false;
            }
        }
        return true;

    }

    public static void fillTheArray(int[] numbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
    }


}
