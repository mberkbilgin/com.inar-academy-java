package chapters.extra.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integers between 1 and 100:(finish with 0)");
        Map<Integer, Integer> map = new HashMap<>();
        int num = input.nextInt();
        while (num != 0) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            num = input.nextInt();
        }
        display(map);
    }

    public static void display(Map<Integer, Integer> map) {
        for (int key:
             map.keySet()) {
            System.out.println(key + " occurs " + map.get(key) + " times");
        }
    }
}