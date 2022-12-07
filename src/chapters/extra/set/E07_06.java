package chapters.extra.set;

import java.util.HashSet;
import java.util.Set;

public class E07_06 {
    public static void main(String[] args) {
        Set<Integer> primeNumbers = new HashSet<>();
        int count = 0;
        for (int i = 2; count < 50; i++) {
            if(isPrime(i)){
                primeNumbers.add(i);
                count++;
            }
        }
        System.out.println("The first prime number is \n" + primeNumbers.toString());
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
