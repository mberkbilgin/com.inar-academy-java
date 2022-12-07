package chapters.extra.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers ");
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(input.nextInt());
        }
        System.out.println("The distinct number is " + set.toString());
    }
}
