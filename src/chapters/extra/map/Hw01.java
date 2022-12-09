package chapters.extra.map;

import java.util.*;

public class Hw01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        int count = 0;
        while (count != 10) {

            System.out.println("Enter key and value");
            int key = input.nextInt();
            String value = input.next();
            map.put(key, value);
            count++;

        }
        displayWithSorting(map);
    }

    private static void displayWithSorting(Map<Integer, String> map) {
        SortedSet<Integer> keys = new TreeSet<>(map.keySet());
        for (int key : keys) {
            String value = map.get(key);
            System.out.println(key + " ==> " + value);
        }
    }
}
