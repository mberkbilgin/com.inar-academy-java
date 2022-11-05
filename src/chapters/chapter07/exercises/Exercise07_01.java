package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the students:");
        int number = input.nextInt();
        int[] scores = new int[number];
        System.out.println("Enter " + number + " scores:");
        fillTheArray(scores);
        assignGrade(scores);
    }

    public static void assignGrade(int[] arr) {
        int best = bestScore(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is A");
            } else if (arr[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is B");
            } else if (arr[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is C");
            } else if (arr[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + arr[i] + " and grade is F");
            }

        }
    }

    public static int bestScore(int[] arr) {
        int best = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > best) {
                best = arr[i];
            }
        }
        return best;
    }

    public static void fillTheArray(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }
}
