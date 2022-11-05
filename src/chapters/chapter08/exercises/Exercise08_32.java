package chapters.chapter08.exercises;

import java.util.Scanner;

public class Exercise08_32 {
    public static void main(String[] args) {
        double[][] triangle = new double[3][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        fillTheArr(triangle);
        double area = getTriangleArea(triangle);
        if(area == 0 ){
            System.out.println("The three points are on the same line");
        }else{
            System.out.printf("The area of the triangle is %.2f",area);
        }
    }
    public static double getTriangleArea(double[][] points){
        double side1 = Math.pow((Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2)), 0.5) ;
        double side2 = Math.pow((Math.pow(points[2][0] - points[1][0], 2) + Math.pow(points[2][1] - points[1][1], 2)), 0.5) ;
        double side3 = Math.pow((Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2)), 0.5) ;
        double s = (side1 + side2 + side3) / 2 ;
        if(s * (s - side1) * (s - side2) * (s - side3) <= 0){
            return 0;
        }else{
            double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5) ;
            return area;
        }

    }
    private static void fillTheArr(double[][] triangle) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = input.nextDouble();
            }
        }
    }
}
