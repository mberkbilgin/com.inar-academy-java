package chapters.chapter06.Exercises;

public class Exercise06_10 {
    public static void main(String[] args) {
        for (int i = 2; i <= 10000 ; i++) {
            isPrime(i);
        }
    }
    public static void isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number);
        }
    }
}
