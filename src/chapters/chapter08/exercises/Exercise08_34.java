package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_34 {
    public static void main(String[] args) {
        double[][] points = new double[6][2];
        System.out.println("Enter 6 points:");
        fillTheArr(points);
        display(getRightmostLowestPoint(points));
    }

    public static void display(double[] rightmostLowestPoint) {
        System.out.println("The rightmost lowest point is (" + rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] arr = new double[2];
        int index = -1;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < points.length ; i++) {
            if(points[i][1] < min){
                min = points[i][1];
                index = i;
            }else if(points[i][1] == min){
                if(points[i][0] > points[i - 1][0] ){
                    index = i;
                }else{
                    index = i -1;
                }
            }
        }
        arr[0] = points[index][0];
        arr[1] = points[index][1];
        return arr;
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
