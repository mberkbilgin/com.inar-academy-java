package chapters.chapter07.exercises;

import java.util.Scanner;

public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int number = input.nextInt();
        String[] students = new String[number];
        int[] scores = new int[number];
        for (int i = 0; i < students.length; i++) {
            fillTheStudents(students, scores, i);
        }
        sortTheStudents(students, scores);
        System.out.println("Name     Score");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-9s%d\n", students[i], scores[i]);
        }

    }

    public static void sortTheStudents(String[] students, int[] scores) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (scores[i] < scores[j]) {
                    swap(students, scores, i, j);
                }
            }
        }
    }

    public static void swap(String[] students, int[] scores, int i, int j) {
        String tempStudent = students[i];
        students[i] = students[j];
        students[j] = tempStudent;

        int tempScore = scores[i];
        scores[i] = scores[j];
        scores[j] = tempScore;
    }

    public static void fillTheStudents(String[] students, int[] scores, int i) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of student");
        students[i] = input.nextLine();
        System.out.println("Enter student's score:");
        scores[i] = input.nextInt();

    }
}
