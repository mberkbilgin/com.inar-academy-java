package chapters.chapter13.exercises.exercise13_02;

import java.util.ArrayList;

public class Exercise13_02 {
    public static void main(String[] args) {
        ArrayList<Number> list = fillTheList();
        display(list);
        shuffle(list);
        display(list);

    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int) (Math.random() * 90);
            Number number = list.get(index);
            Number temp = list.get(i);
            list.set(i, number);
            list.set(index, temp);
        }
    }

    private static void display(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println("______________________________");
    }

    private static ArrayList<Number> fillTheList() {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 10; i < 100; i++) {
            list.add(i);
        }
        return list;
    }
}
