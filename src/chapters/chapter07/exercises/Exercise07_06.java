package chapters.chapter07.Exercises;

public class Exercise07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int index = 0;
        for (int i = 2; index < 50; i++) {

            if (isPrime(i)) {
                primeNumbers[index] = i;
                index++;
            }
        }
        displayPrimeNumber(primeNumbers);
    }

    public static void displayPrimeNumber(int[] primeNumbers) {
        int count = 1;
        for (int i = 0; i < primeNumbers.length; i++) {
            if (count % 10 == 0){
                System.out.println(primeNumbers[i]);
                count++;
            }else {
                System.out.print(primeNumbers[i] + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
