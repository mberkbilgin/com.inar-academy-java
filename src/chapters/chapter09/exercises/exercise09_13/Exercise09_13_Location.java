package chapters.chapter09.exercises.exercise09_13;

import java.util.Scanner;

public class Exercise09_13_Location {
    public int row;
    public int column;
    public double maxValue;

    Exercise09_13_Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Exercise09_13_Location locateLargest(double[][] a) {
        double max = Integer.MIN_VALUE;
        int x = -1;
        int y = -1;
        for (int j = 0; j < a.length; j++) {
            for (int l = 0; l < a[j].length; l++) {
                if (a[j][l] > max) {
                    max = a[j][l];
                    x = j;
                    y = l;
                }
            }
        }
        return new Exercise09_13_Location(x, y, max);
    }



}
