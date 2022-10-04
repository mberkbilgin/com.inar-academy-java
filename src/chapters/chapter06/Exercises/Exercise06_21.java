package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        str = str.toUpperCase();
        for (int i = 0; i < str.length() ; i++) {
            if(Character.isLetter(str.charAt(i))){
                System.out.print(getNumber(str.charAt(i)));
            }else
                System.out.print(str.charAt(i));
        }
    }
    public static int getNumber(char upperCaseLetter){
        switch (upperCaseLetter){
            case 'A' : return 2;
            case 'B' : return 2;
            case 'C' : return 2;
            case 'D' : return 3;
            case 'E' : return 3;
            case 'F' : return 3;
            case 'G' : return 4;
            case 'H' : return 4;
            case 'İ' : return 4;
            case 'J' : return 5;
            case 'K' : return 5;
            case 'L' : return 5;
            case 'M' : return 6;
            case 'N' : return 6;
            case 'O' : return 6;
            case 'P' : return 7;
            case 'Q' : return 7;
            case 'R' : return 7;
            case 'S' : return 7;
            case 'T' : return 8;
            case 'U' : return 8;
            case 'V' : return 8;
            case 'W' : return 9;
            case 'X' : return 9;
            case 'Y' : return 9;
            case 'Z' : return 9;
        }
        return 0;
    }
}
