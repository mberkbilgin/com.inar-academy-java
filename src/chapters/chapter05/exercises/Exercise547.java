package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise547 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
        String str = input.nextLine();
        if (str.length() != 12) {
            System.out.println(str+" is an invalid input");
        } else {
            int checksum = 0;
            for (int i = 0; i < 12; i++) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9 || i == 11) {
                    checksum += 3 * (str.charAt(i) - '0');
                } else
                    checksum += str.charAt(i) - '0';
            }
            checksum %= 10;
            checksum = 10 - checksum;
            if (checksum == 10)
                checksum = 0;
            System.out.println("The ISBN-13 number is " + str + "" + checksum);
        }
    }
}