package chapters.chapter08.exercises;

import java.util.Arrays;

public class Exercise08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        int point1 = -1;
        int point2 = -1;
        double shortDistance = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            for (int k = i + 1; k < 8; k++) {
                if (shortDistance > distance(points, i, k)) {
                    shortDistance = distance(points, i, k);
                    point1 = i;
                    point2 = k;
                }
            }
        }
        System.out.println("The nearest points is " + Arrays.toString(points[point1]) + " and " + Arrays.toString(points[point2]));
        System.out.println("The distance between two points is " + shortDistance);

    }

    public static double distance(double[][] points, int i, int k) {
        double distance = Math.sqrt(Math.pow((points[i][0] - points[k][0]), 2) + Math.pow((points[i][1] - points[k][1]), 2) + Math.pow((points[i][2] - points[k][2]), 2));
        return distance;
    }
}
