package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise548 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente a string:");
        String str = input.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i += 2) {
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }



}
