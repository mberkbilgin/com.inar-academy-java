package chapters.chapter08.Exercises;

import java.util.Scanner;

public class Exercise08_31 {
    public static void main(String[] args) {
        System.out.println("Enter values for x1,y1,x2,y2,x3,y3,x4,y4");
        double[][] points = new double[4][2];
        double[] arr = new double[2];
        fillTheArr(points);
        arr = getIntersectingPoint(points);
        if(arr == null){
            System.out.println("The two lines are parallel.");
        }else{
            System.out.printf("The intersecting point is at (%.2f, %.2f)", arr[0],arr[1]);
        }


    }
    public static double[] getIntersectingPoint(double[][] points){
        double[] temp =new double[2];
        double a = points[0][1] - points[1][1];
        double b = -(points[0][0] - points[1][0]);
        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        double c = (points[2][1] - points[3][1]);
        double d = -(points[2][0] - points[3][0]);
        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        if (a * d - b * c == 0) {
            temp = null;
        }else {
            temp[0] = (e * d - b * f) / (a * d - b * c);
            temp[1] = (a * f - e * c) / (a * d - b * c);
        }
        return temp;

    }

    public static void fillTheArr(double[][] points) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
    }
}
