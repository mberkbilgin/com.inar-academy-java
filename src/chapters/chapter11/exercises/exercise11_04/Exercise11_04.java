package chapters.chapter11.exercises.exercise11_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = getFromUser();
        System.out.println("The largest number is " + max(arrayList));
    }
    public static Integer max(ArrayList<Integer> list){
        if(list.size() == 0){
            return null;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

    public static ArrayList<Integer> getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers(if you enter 0, list ends)");
        ArrayList<Integer> arrayList = new ArrayList<>();
        int number = input.nextInt();
        while(number != 0){
            arrayList.add(number);
            number = input.nextInt();
        }
        return arrayList;
    }
}
