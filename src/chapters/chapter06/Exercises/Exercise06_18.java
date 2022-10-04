package chapters.chapter06.Exercises;



import java.util.Scanner;

public class Exercise06_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.nextLine();
        if (isValid(password)){
            System.out.println("Password is valid");
        }else
            System.out.println("Password is invalid.");

    }

    public static boolean isValid(String str) {
        if (numberOfCharacter(str) && atLeast2Digit(str) && onlyCharacterDigit(str)) {
            return true;
        } else{
            return false;
        }
    }
    public static boolean numberOfCharacter(String str) {
        if (str.length() < 8) {
            System.out.println("Password must be at least 8 character");
            return false;
        } else
            return true;
    }
    public static boolean atLeast2Digit (String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (char ch1 = '0'; ch1 <= '9'; ch1++) {
                if (str.charAt(i) == ch1) {
                    count++;
                    break;
                }
            }
        }
        if (count < 2) {
            System.out.println("Password must contains at least 2 digit");
            return false;
        } else
            return true;
    }
    public static boolean onlyCharacterDigit(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                System.out.println("Password must contains only digit and character");
                return false;
            }
        }
        return true;
    }

}