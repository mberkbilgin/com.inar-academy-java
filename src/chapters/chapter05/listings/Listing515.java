package chapters.chapter05.listings;

public class Listing515 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME_NUMBERS = 50;
        int count = 0;
        int number = 2;



        while (count < NUMBER_OF_PRIME_NUMBERS) {

            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if(count % 10 == 0){
                    System.out.println(number);
                }else
                    System.out.print(number+" ");
            }
            number++;
        }
    }
}







