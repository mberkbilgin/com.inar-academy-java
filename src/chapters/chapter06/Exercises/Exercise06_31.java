package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        long number = input.nextLong();

        if (isValid(number) && (getSize(number) >= 13 && getSize(number) <= 16) &&
                (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6))){
            System.out.println(number+" is valid");
        }else
        System.out.println(number+" is invalid");
    }

    public static boolean prefixMatched(long number, int d){
        String str = number + "";
        if(d <= 6){
            return Integer.parseInt(String.valueOf(str.charAt(0) + "")) == d;
        }else
            return Integer.parseInt(String.valueOf(str.substring(0,2))) == d;

    }
    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    public static boolean isValid(long number){
        if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0){
            return true;
        }else
            return false;
    }

    public static int sumOfOddPlace(long number) {
        String str = number + "";
        int sum = 0;
        for (int i = str.length()-1; i >= 0; i -= 2) {
            int k = Integer.parseInt(String.valueOf(str.charAt(i) + ""));
            sum += k;
        }
        return sum;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String str = number + "";
        int sum = 0;
        for (int i = str.length()-2; i >= 0 ; i -= 2) {
            int k = Integer.parseInt(String.valueOf(str.charAt(i) + ""));
            sum += getDigit(k);
        }
        return sum;
    }
    public static int getDigit(int number){
        String str = Integer.toString(2 * number);
        int sum = 0;
        if(str.length() == 2 ){
            sum = Integer.parseInt(String.valueOf(str.charAt(0) + "")) +  Integer.parseInt(String.valueOf(str.charAt(1) + ""));
        }else
            sum = Integer.parseInt(String.valueOf(str.charAt(0) + ""));
        return sum;
    }

}
