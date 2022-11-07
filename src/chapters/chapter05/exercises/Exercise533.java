package chapters.chapter05.exercises;

public class Exercise533 {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 6 and 10000 is ");
        for (int i = 6; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j < i ; j++) {
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
