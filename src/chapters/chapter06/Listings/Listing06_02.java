package chapters.chapter06.Listings;

import java.util.Scanner;

public class Listing06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        double score = input.nextDouble();
        printGrade(score);
    }
    public static void printGrade(double score){
        if(score >= 90){
            System.out.println("The grade is A");
        }else if(score >= 80) {
            System.out.println("The grade is B");
        }else if(score >= 70) {
            System.out.println("The grade is C");
        }else if(score >= 60) {
            System.out.println("The grade is D");
        }else {
            System.out.println("The grade is F");
        }
    }
}
