package chapters.chapter06.Exercises;

import java.sql.SQLOutput;

public class Exercise06_30 {
    public static void main(String[] args) {
        int i = (int)(Math.random()*7);
        int k = (int)(Math.random()*7);
        craps(i,k);
    }

    public static void craps(int i, int k) {
        System.out.println("You rolled "+i+" + "+k+" = "+(i+k));
        if (i+k == 2 || i+k == 3 || i+k == 12 ){
            System.out.println("You lose");
        }else if (i+k == 7 || i+k == 11){
            System.out.println("You win");
        }else {
            System.out.println("Point is "+(i+k));
            int old =i+k;
            do{
                i = (int)(Math.random()*7);
                k = (int)(Math.random()*7);
            }while(old != i+k && i+k != 7);
            System.out.println("You rolled "+i+" + "+k+" = "+(i+k));
            if(old == i + k){
                System.out.println("You win");
            }else
                System.out.println("You lose");
        }

    }
}
