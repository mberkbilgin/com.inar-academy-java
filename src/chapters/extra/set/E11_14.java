package chapters.extra.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class E11_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.println("Enter 5 integers for list1");
        for (int i = 0; i < 5; i++) {
            set1.add(input.nextInt());
        }
        System.out.println("Enter 5 integers for list2");
        for (int i = 0; i < 5; i++) {
            set2.add(input.nextInt());
        }
        union(set1,set2);
    }

    private static void union(Set<Integer> set1, Set<Integer> set2) {
        for (int i:
             set2) {
            set1.add(i);
        }
        System.out.println("The union list is " + set1);
    }

}
