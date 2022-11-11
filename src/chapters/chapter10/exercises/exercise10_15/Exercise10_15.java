package chapters.chapter10.exercises.exercise10_15;

import chapters.chapter10.exercises.exercise10_13.MyRectangle2D;

import java.util.Scanner;

public class Exercise10_15 {
    public static void main(String[] args) {
        double[][] points = fillTheArr();
        MyRectangle2D rectangle = getRectangle(points);
        System.out.printf("The bounding rectangle's center (%.2f, %.2f), width %.1f, height %.1f",rectangle.getX(),rectangle.getY(),rectangle.getWidth(),rectangle.getHeight());

    }
    public static MyRectangle2D getRectangle(double[][] points){
        double x = (points[0][0] + points[1][0] + points[2][0] + points[3][0] + points[4][0]) / 5;
        double y = (points[0][1] + points[1][1] + points[2][1] + points[3][1] + points[4][1]) / 5;
        double width = (maxX(points) - x) * 2;
        double height = (maxY(points) - y) * 2;
        MyRectangle2D r = new MyRectangle2D(x,y,width,height);
        return r;
    }

    private static double maxY(double[][] points) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length ; i++) {
            if(max < points[i][1]){
                max = points[i][1];
            }
        }
        return max;
    }

    private static double maxX(double[][] points) {
    double max = Integer.MIN_VALUE;
        for (int i = 0; i < points.length ; i++) {
            if(max < points[i][0]){
                max = points[i][0];
            }
        }
        return max;
    }

    public static double[][] fillTheArr() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five points");
        double[][] points = new double[5][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        return points;
    }
}
