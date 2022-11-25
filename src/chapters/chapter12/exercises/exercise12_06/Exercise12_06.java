package chapters.chapter12.exercises.exercise12_06;

import java.util.Scanner;

public class Exercise12_06 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a hex number:");
            String str = input.next();
            str = str.toUpperCase();
            hex2Dec(str);
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void hex2Dec(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!('A' <= str.charAt(i) && str.charAt(i) <= 'F') &&
                    !('0' <= str.charAt(i) && str.charAt(i) <= '9')) {
                throw new NumberFormatException("INVALID INPUT!");
            }
        }
        String str1= "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str.charAt(i) +str1;
        }
        int h = 0;
        for (int i = 0; i < str1.length(); i++) {
            double k = 0;
            switch (str1.charAt(i)){
                case '0': k = 0; break;
                case '1': k = 1; break;
                case '2': k = 2; break;
                case '3': k = 3; break;
                case '4': k = 4; break;
                case '5': k = 5; break;
                case '6': k = 6; break;
                case '7': k = 7; break;
                case '8': k = 8; break;
                case '9': k = 9; break;
                case 'A': k = 10; break;
                case 'B': k = 11; break;
                case 'C': k = 12; break;
                case 'D': k = 13; break;
                case 'E': k = 14; break;
                case 'F': k = 15;
            }
            h += k * Math.pow(16,i);
        }
        System.out.println(str+" is "+h+" in decimal value.");


    }
}
