package chapters.chapter06.Exercises;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of triangle:");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (isValid(side1,side2,side3)){
            System.out.println("The area of the triangle is "+area(side1,side2,side3));
        }else
            System.out.println("The input is invalid");
    }
    public static boolean isValid(double side1, double side2, double side3){
        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            return true;
        }else
            return false;
    }
    public static double area(double side1, double side2, double side3){
        double side = (side1 + side2 + side3) / 2;
        double area =  Math.pow((side * (side - side1) * (side - side2) * (side - side3)), 0.5) ;
        return area;
    }

}
