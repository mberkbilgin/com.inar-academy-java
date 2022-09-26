package chapters.chapter05.Exercises;

public class Exercise520 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true){
                count++;
                if(count % 8 == 0)
                    System.out.printf("%5d\n",i);
                else
                    System.out.printf("%5d",i);
            }

        }
    }
}
