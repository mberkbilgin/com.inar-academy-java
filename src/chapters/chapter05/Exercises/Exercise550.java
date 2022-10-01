package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise550 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int upperCase = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ' '){
                if (str.charAt(i) == str.toUpperCase().charAt(i)){
                upperCase++;
                }
            }
        }
        System.out.println("The number of upper case is "+upperCase);
    }
}
