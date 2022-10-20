package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_04 {
    public static void main(String[] args) {
        int[][] m = new int[8][7];
        System.out.println("Enter the weekly hours for each employee ");
        fillTheArr(m);
        int[] sumHoursOfEmployment = new int[8];
        sumHours(m,sumHoursOfEmployment);
        System.out.println("Employees and their total hours in decreasing order of the total hours");
        for (int i = 24 * 7; i >= 0; i--) {
            sortingEmployes(sumHoursOfEmployment,i);
        }
    }

    public static void sortingEmployes(int[] sumHoursOfEmployment, int i) {
        for (int j = 0; j < sumHoursOfEmployment.length; j++) {
            if(sumHoursOfEmployment[j] == i){
                System.out.println("Employees " + (j + 1) + " and him total hours is " + sumHoursOfEmployment[j]);
            }
        }
    }

    private static void sumHours(int[][] m, int[] sumHoursOfEmployment) {
        for (int i = 0; i < m.length; i++) {
            int sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
            sumHoursOfEmployment[i] = sum;
        }
    }

    public static void fillTheArr(int[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }
    }
}
