package chapters.chapter06.Exercises;

import java.util.Scanner;

public class Exercise06_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = input.nextLine();
        System.out.println("The number of letters in the string is " + countLetters(s));
    }
    public static int countLetters(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
