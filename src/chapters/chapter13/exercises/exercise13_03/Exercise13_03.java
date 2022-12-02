package chapters.chapter13.exercises.exercise13_03;

import java.util.ArrayList;

public class Exercise13_03 {
    public static void main(String[] args) {
        ArrayList<Number> list = fillRandomly();
        display(list);
        sort(list);
        display(list);
    }
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if((int)(list.get(i)) > (int)(list.get(j))){
                    Number temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
    }
    private static ArrayList<Number> fillRandomly() {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            int number = (int) (Math.random() * 100);
            list.add(number);
        }
        return list;
    }

    private static void display(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((i + 1) % 10 == 0) {
                System.out.printf("%-4d\n", list.get(i));
            } else {
                System.out.printf("%-4d", list.get(i));
            }
        }
        System.out.println("_____________________________________");
    }
}
