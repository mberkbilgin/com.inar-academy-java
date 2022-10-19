package chapters.chapter08.Listings;

import java.util.Scanner;

public class Listing08_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of points: ");
        int numberOfPoints = input.nextInt();
        double[][] points = new double[numberOfPoints][2];
        System.out.println("Enter " + numberOfPoints + " points:");
        for (int i = 0; i < points.length ; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        int p1 = 0;
        int p2 = 1;
        double shortDistance = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if(shortDistance > distance){
                    shortDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        System.out.println("The closest point is (" + points[p1][0]+", " + points[p1][1] + ") and (" + points[p2][0] + ", " + points[p2][1] + ")" );

    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
