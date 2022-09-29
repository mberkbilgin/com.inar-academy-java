package chapters.chapter06.Listings;

import java.util.Scanner;

public class Listing06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        double score = input.nextDouble();
        char ch = getGrade(score);
        System.out.println("The grade is "+ch);
    }
    public static char getGrade(double score){
        if (score >= 90){
                return 'A';
        } else if(score >= 80){
            return 'B';
        }else if(score >= 70){
            return 'C';
        }else if(score >= 60){
            return 'D';
        }else {
            return 'F';
        }
    }
}
