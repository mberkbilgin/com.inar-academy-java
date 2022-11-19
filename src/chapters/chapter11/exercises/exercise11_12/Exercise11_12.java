package chapters.chapter11.exercises.exercise11_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_12 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>();
        fillTheArr(list);
        System.out.println("The sum of all numbers is " +sum(list));
    }

    public static void fillTheArr(ArrayList<Double> list) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            double number = input.nextDouble();
            list.add(number);
        }
    }
    public static double sum(ArrayList<Double> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
