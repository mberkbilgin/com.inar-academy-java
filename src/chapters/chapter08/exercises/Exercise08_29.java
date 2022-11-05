package chapters.chapter08.exercises;

import java.util.Arrays;

import static chapters.chapter08.exercises.Exercise08_04.fillTheArr;

public class Exercise08_29 {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        System.out.println("Enter list1:");
        fillTheArr(m1);
        int[][] m2 = new int[3][3];
        System.out.println("Enter list2:");
        fillTheArr(m2);
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        boolean isStrictly = true;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    isStrictly = false;
                    break;
                }
            }
        }
        if (isStrictly) {
            return true;
        } else {
            int[] arr1 = new int[9];
            int[] arr2 = new int[9];
            arr1 = copy(m1);
            arr2 = copy(m2);
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }

        }
        return true;
    }

    public static int[] copy(int[][] m1) {
        int[] temp = new int[9];
        int k = 0;
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                temp[k] = m1[i][j];
                k++;
            }
        }
        return temp;
    }
}
