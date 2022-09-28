package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise537 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value: ");
        int dec = input.nextInt();
        String a = "";
        System.out.print(dec);
       while(dec != 0){
           a = (dec % 2) + a;
           dec /= 2;
       }
        System.out.println(" is "+a+" in binary value");
    }
}
