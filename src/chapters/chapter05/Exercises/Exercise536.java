package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exericse536 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as integer :");
        int number = input.nextInt();
        int d10 = 0;
        System.out.print(number);
        for (int i = 9; i >= 1; i--) {
            d10 += (number % 10) * i;
            number /= 10;
        }
        if(d10 % 11 == 10){
            System.out.println("X");
        }else
            System.out.println(d10 % 11 +"");
    }
}
