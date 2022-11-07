package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise549 {
    public static void main(String[] args) {
        int vowel = 0;
        int consonant = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ){
                vowel++;
            }else if (str.charAt(i) == ' ' ){

            }else
                consonant++;
        }
        System.out.println("The number of vowels is "+vowel);
        System.out.println("The number of consonants is "+consonant);
    }
}
