package chapters.chapter05.listings;

import java.util.Scanner;

public class Listing514 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isPalindrome = true;
        System.out.println("Enter a string:");
        String str = input.nextLine();


        int i = 0;
        while (i <= str.length()/2) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
            i++;
        }

        if(isPalindrome ){
                System.out.println(str+" is palindrome");
            }else {
                System.out.println(str+" is not palindrome");
            }


        }
    }


