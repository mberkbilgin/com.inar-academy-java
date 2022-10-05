package chapters.chapter06.Exercises;

public class Exercise06_27 {
    public static void main(String[] args) {
       int count = 0;
       for (int i = 13; count < 100; i++) {
           if (isPrime(i) && nonpalindromic(i) && isSame(i)){
               count++;
               if(count % 10 == 0){
                   System.out.println(i);
               }else
                   System.out.print(i+" ");
            }
        }

    }

    private static boolean isSame(int i) {
        if(backward(i) != i){
            return true;
        }else
            return false;
    }

    public static boolean nonpalindromic(int i) {
        if(isPrime(backward(i))){
            return true;
        }else
            return false;

    }
    public static int backward(int i) {
        String str = Integer.toString(i);
        String str1 = "";
            for (int j = 0; j < str.length(); j++) {
                 str1 = str.charAt(j) + str1;
            }
            return Integer.parseInt(str1);
    }


    public static boolean isPrime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
