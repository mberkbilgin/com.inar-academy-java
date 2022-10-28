package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_33 {
    public static void main(String[] args) {
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double[][] m = new double[4][2];
        fillTheArr(m);
        double[] arr = getIntersectingPoint(m);
        double[] area = new double[4];
        area[0] = getTriangleArea(m[0][0], m[0][1], m[1][0], m[1][1], arr[0], arr[1]);
        area[1] = getTriangleArea(m[1][0], m[1][1], m[2][0], m[2][1], arr[0], arr[1]);
        area[2] = getTriangleArea(m[2][0], m[2][1], m[3][0], m[3][1], arr[0], arr[1]);
        area[3] = getTriangleArea(m[0][0], m[0][1], m[3][0], m[3][1], arr[0], arr[1]);
        increaseSort(area);
        System.out.printf("The areas are %4.2f %-4.2f %-4.2f %-4.2f",area[0],area[1],area[2],area[3]);

    }


    public static void increaseSort(double[] area) {

        for (int i = 0; i < area.length - 1; i++) {
            double temp = 0;
            for (int j = i + 1; j < area.length; j++) {
                if (area[i] > area[j]) {
                    temp = area[i];
                    area[i] = area[j];
                    area[j] = temp;
                }
            }
        }
    }

    public static double getTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double side1 = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
        double side2 = Math.pow((Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)), 0.5);
        double side3 = Math.pow((Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)), 0.5);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        return area;
    }

    public static void fillTheArr(double[][] m) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] temp = new double[2];
        double a = points[0][1] - points[2][1];
        double b = -(points[0][0] - points[2][0]);
        double e = (points[0][1] - points[2][1]) * points[0][0] - (points[0][0] - points[2][0]) * points[0][1];
        double c = (points[1][1] - points[3][1]);
        double d = -(points[1][0] - points[3][0]);
        double f = (points[1][1] - points[3][1]) * points[1][0] - (points[1][0] - points[3][0]) * points[1][1];

        if (a * d - b * c == 0) {
            return null;
        } else {
            temp[0] = (e * d - b * f) / (a * d - b * c);
            temp[1] = (a * f - e * c) / (a * d - b * c);
        }

        return temp;
    }

}

