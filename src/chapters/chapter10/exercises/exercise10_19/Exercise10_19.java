package chapters.chapter10.exercises.exercise10_19;


import java.math.BigInteger;

public class Exercise10_19 {
    public static void main(String[] args) {
        int[] numbers = createArr();
        display(numbers);

    }

    public static void display(int[] numbers) {
        BigInteger constant = new BigInteger("2");
        for (int i = 0; i < numbers.length; i++) {
            BigInteger number = new BigInteger(numbers[i] + "");
            number = (constant.pow(number.intValue())).add(new BigInteger("-1"));
            if(number.isProbablePrime(1)){
                System.out.println(number.toString());
            }

        }
    }

    public static int[] createArr() {
        int[] numbers = new int[25];
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                numbers[count] = i;
                count++;
            }
        }
        return numbers;
    }

    public static boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
