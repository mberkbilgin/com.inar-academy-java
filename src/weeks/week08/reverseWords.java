package weeks.week08;

import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first string:");
        String str1 = input.nextLine();
        System.out.println("Enter second string:");
        String str2 = input.nextLine();
        boolean result = isReverseWords(str1, str2);
        System.out.println(result);
    }
    public static boolean isReverseWords(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        String s3 = a + a;
        return s3.contains(b);
    }
}
