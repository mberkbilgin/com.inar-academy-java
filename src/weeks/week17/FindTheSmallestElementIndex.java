package weeks.week17;

import java.util.ArrayList;
import java.util.List;

public class FindTheSmallestElementIndex {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list = fillRandomly(list);

        findTheSmallestNumber(list);
    }

    private static void findTheSmallestNumber(List<Integer> list) {
        int number = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < list.size(); i++) {
            if (number > (int) list.get(i)) {
                number = (int) list.get(i);
                j = i;
            }
        }
        System.out.println("The smallest number of list is " + number);
        System.out.println("The index of smallest number is " + j);
    }


    private static List<Integer> fillRandomly(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 100);
            list.add(number);
        }
        return list;
    }
}
