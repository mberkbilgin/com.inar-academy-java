package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise546 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  string:");
        String str = input.nextLine();
        String str2 = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            str2 += str.charAt(i);
        }
        System.out.println("The reversed string is "+str2);
    }
}
