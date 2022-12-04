package weeks.week17;

import java.util.*;


public class UniqueValues {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list = fillRandomly(list);
        print(Arrays.toString(list.toArray()));
        Set<Integer> set = fillWithUniqueValue(list);
        print(Arrays.toString(set.toArray()));
    }


    private static Set<Integer> fillWithUniqueValue(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        return set;
    }

    private static void print(String list) {
        for (int i = 0; i < list.length(); i++) {
            System.out.print(list.charAt(i) + " ");
        }
        System.out.println();
    }

    private static List<Integer> fillRandomly(List<Integer> list) {
        for (int i = 0; i < 15; i++) {
            int number = (int) (Math.random() * 10);
            list.add(number);
        }
        return list;
    }
}
