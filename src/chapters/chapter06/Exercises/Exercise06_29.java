package chapters.chapter06.Exercises;

public class Exercise06_29 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (isPrime(i) && isTwin(i)){
                System.out.println("("+i+", "+(i+2)+")");
            }
        }
    }
    public static boolean isTwin(int i) {
        int j = i + 2;
        if (isPrime(j)){
            return true;
        }else
            return false;
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0){
                return false;
            }
        }
        return true;
    }
}
