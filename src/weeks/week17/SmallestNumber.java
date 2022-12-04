package weeks.week17;

import java.util.ArrayList;
import java.util.List;

public class SmallestNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list = fillRandomly(list);
        smallestNumber(list);
    }

    private static List<Integer> fillRandomly(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            int number = (int)(Math.random()*100);
            list.add(number);
        }
        return list;
    }

    private static void smallestNumber(List list) {
        int number = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(number > (int)list.get(i)){
                number = (int)list.get(i);
            }
        }
        System.out.println("The smallest number of list is " + number);
    }
}
