package chapters.chapter10.exercises.exercise10_20;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Exercise10_20 {
    public static void main(String[] args) {
        display();

    }

    public static void display() {
        System.out.println("if i = 100, e is ");
        e(100);
        System.out.println("if i = 200, e is ");
        e(200);
        System.out.println("if i = 300, e is ");
        e(300);
        System.out.println("if i = 400, e is ");
        e(400);
        System.out.println("if i = 500, e is ");
        e(500);
        System.out.println("if i = 600, e is ");
        e(600);
        System.out.println("if i = 700, e is ");
        e(700);
        System.out.println("if i = 800, e is ");
        e(800);
        System.out.println("if i = 900, e is ");
        e(900);
        System.out.println("if i = 1000, e is ");
        e(1000);

    }

    public static void e(int number) {
        BigDecimal e = new BigDecimal(1);
        for (int i = 1; i <= number; i++) {

            e = e.add((BigDecimal.ONE).divide(factorial(i),25, BigDecimal.ROUND_UP));

        }
        System.out.println(e.toString());

    }


    public static BigDecimal factorial(int i) {
        BigDecimal number = new BigDecimal(1);
        for (int j = i; j > 0; j--) {
            number = number.multiply(new BigDecimal(j));
        }

        return number;
    }
}
