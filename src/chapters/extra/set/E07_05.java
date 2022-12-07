package chapters.extra.set;

import java.util.*;

public class E07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        System.out.println("The distinct number is " + set.size());
        System.out.println("The distinct list is " + set.toString());
    }

}
