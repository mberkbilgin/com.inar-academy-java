package chapters.chapter12.exercises.exercise12_07;

import java.util.Scanner;

public class Exercise12_07 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a binary number");
            String str = input.next();
            int dec = bin2Dec(str);
            System.out.println(dec + " is decimal number");
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dec(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ('0' != str.charAt(i) && '1' != str.charAt(i)) {
                throw new NumberFormatException("INVALID INPUT!");
            }
        }
        int num = Integer.parseInt(str);
        int decValue = 0;

        int base = 1;

        int temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            decValue += lastDigit * base;
            base = base * 2;
        }

        return decValue;
    }
}
