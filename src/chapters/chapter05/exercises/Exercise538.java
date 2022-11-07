package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise538 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a valid for decimal:");
        int dec = input.nextInt();
        String str = "";
        System.out.print(dec);
        while(dec != 0){
            str = dec % 8 + str;
            dec /= 8;
        }
        System.out.println(" is "+str+" in octal value");
    }
}
