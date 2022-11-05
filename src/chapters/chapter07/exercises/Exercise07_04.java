package chapters.chapter07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise07_04 {
    public static void main(String[] args) {
        System.out.println("Enter scores:");
        int[] arr = new int[101];
        Arrays.fill(arr,-1);
        fillScore(arr);
        System.out.println(isAbove(arr)+" scores are above or equal to the average");
        System.out.println(isBelow(arr)+" scores are above or equal to the average");
    }

    public static int isBelow(int[] arr) {
        int average = (int)Math.round(average(arr));
        int below = 0;
        for (int i = average - 1; i >= 0; i--) {
            for (int j = 0; j <= 100 ; j++) {
                if(arr[i] == j){
                    below += j + 1;
                }
            }
        }
        return below;
    }

    public static int isAbove(int[] arr) {
        int average = (int)Math.round(average(arr));
        int above = 0;
        for (int i = average; i < arr.length; i++) {
            for (int j = 0; j <= 100 ; j++) {
                if(arr[i] == j){
                    above += j + 1;
                }
            }
        }
        return above;
    }

    public static double average(int[] arr) {
        double number = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                sum += (arr[i]+1) * i;
                number += arr[i] + 1;
            }
        }
        return sum / number;
    }

    public static void fillScore(int[] arr) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        while(score >= 0){
            score = input.nextInt();
            if (score >= 0) {
                arr[score]++;
            }
        }


    }
}
