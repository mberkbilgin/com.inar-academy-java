package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        if (isPalindrome(number)){
            System.out.println(number + " is a palindrome");
        }else
            System.out.println(number + " is not a palindrome");
    }
    public static int reverse(int i){
        String str = i + "";
        String str1 = "";
        for (int j = 0; j < str.length(); j++) {
            str1 = str.charAt(j) + str1;
        }
        return Integer.parseInt(str1);

    }
    public  static boolean isPalindrome(int number){
        if (number == reverse(number)){
            return true;
        }else
            return  false;
    }
}
