package chapters.chapter11.exercises.exercise11_07;

import java.util.ArrayList;

public class Exercise11_07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillWithRandomNumber(list);
        display(list);
        System.out.println();

        shuffle(list);
        display(list);
    }

    public static void display(ArrayList<Integer> list) {
        for (Integer number:list
             ) {
            System.out.print(number + " ");
        }
    }

    public static void fillWithRandomNumber(ArrayList<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }


    }
    public static void shuffle(ArrayList<Integer> list){
        int index;
        int temp;
            for (int i = 0; i < list.size(); i++) {
                index = (int)(Math.random() * 100);
                temp = list.get(index);

                list.set(i,temp);
                list.set(index, list.get(i));
        }
    }
}
