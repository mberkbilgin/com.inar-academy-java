package chapters.chapter05.exercises;

public class Exercise512 {
    public static void main(String[] args) {
        int i = 0;
        while(Math.pow(i,2) < 12000){
            i++;
        }
        System.out.println("The smallest number such that n^2 > 12000 is "+i );
    }
}
