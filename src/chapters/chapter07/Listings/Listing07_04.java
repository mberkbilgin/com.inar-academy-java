package chapters.chapter07.Listings;

import java.util.Arrays;

import static chapters.chapter06.Listings.Listing06_10.getRandomLowerCharacter;

public class Listing07_04 {
    public static void main(String[] args) {
        char[] arr = new char[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomLowerCharacter();
        }
        displayArray(arr);
        countLetter(arr);
    }

    public static void displayArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if((i+1) % 20 == 0){
                System.out.println(arr[i]);
            }else
                System.out.print(arr[i] + " ");
        }
    }

    public static void countLetter(char[] arr){
        int[] count = new int[26];
        for (char ch = 'a'; ch <= 'z' ; ch++) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == ch ){
                    count[ch-'a']++;
                }

            }
            System.out.println("count["+(ch-'a')+"] :" + count[ch-'a'] );
        }
    }
}
