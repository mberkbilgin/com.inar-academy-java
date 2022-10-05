package chapters.chapter06.Exercises;

public class Exercise06_26 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; count < 100; i++) {
            if(isPrime(i) && isPalindrome(i)){
                count++;
                if(count % 10 == 0)
                    System.out.println(i);
                else
                    System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if(number % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isPalindrome(int number){
        String str = number + "";
        if (str.length() == 1){
            return true;
        }
        if (str.length() == 2 && str.charAt(0) == str.charAt(1)){
            return true;
        }
        if (str.length() >= 3){
            boolean isPalindrome = true;
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length()-1-i)){
                    isPalindrome = false;
                    break;
                } else
                    isPalindrome = true;
            }
            return isPalindrome;
        }
        return false;
    }
}
