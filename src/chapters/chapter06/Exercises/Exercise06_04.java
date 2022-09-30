package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = input.nextInt();
        reversed(number);
    }
    public static void reversed(int number){
        String str = number + "";
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 = str.charAt(i) + str1;
        }
        System.out.println(str1);
    }
}
