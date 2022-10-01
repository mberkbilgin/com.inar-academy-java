package chapters.chapter05.Exercises;

import java.util.Scanner;

public class Exercise551 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = input.nextLine();
        System.out.println("Enter the second string:");
        String str2 = input.nextLine();
        String str = "";
        for (int i = 0; i < ((str1.length() < str2.length()) ? str1.length() : str2.length()); i++) {
            if(str1.charAt(i) == str2.charAt(i)){
                str += str1.charAt(i);
            }
        }
        if (str.length() < 2){
            System.out.println(str1 + " and " + str2 + " have no common prefix");
        }else
            System.out.println("The common prefix is "+str);

    }

}
