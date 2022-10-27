package chapters.chapter08.Exercises;

import static chapters.chapter08.Exercises.Exercise08_04.fillTheArr;

public class Exercise08_28 {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3];
        System.out.println("Enter list1:");
        fillTheArr(m1);
        int[][] m2 = new int[3][3];
        System.out.println("Enter list2:");
        fillTheArr(m2);
        if (equals(m1, m2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }

    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
