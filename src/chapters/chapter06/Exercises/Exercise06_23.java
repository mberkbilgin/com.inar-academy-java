package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.nextLine();
        System.out.println("Enter a char: ");
        String ch = input.next();
        while(ch.length() != 1){
            System.out.println("Try again. Should be one character.");
            ch = input.next();
        }
        char ch1 = ch.charAt(0);
        System.out.println("Occurrences of "+ch1+" in the sentence is "+count(str,ch1) );
    }
    public static int count(String str, char a){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a){
                count++;
            }
        }
        return count;
    }
}
