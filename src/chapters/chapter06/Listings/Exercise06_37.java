package chapters.chapter06.Listings;

import java.util.Scanner;

public class Exercise06_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for number:");
        int number = input.nextInt();
        System.out.println("Enter a value for width");
        int width = input.nextInt();
        System.out.println(format(number,width));
    }
    public static String format(int number, int width){
        String str = number + "";
        String str2 = "";
        for (int i = 0; i < width - str.length() ; i++) {
            str2 += 0;
        }
        return str2 + str;
    }
}
