package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for side");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is "+area(side));
    }
    public static double area (double s){
        return (5 * s * s) / (4 * Math.tan(Math.PI/5) );
    }
}
