package chapters.chapter11.exercises.exercise11_06;

import chapters.chapter10.listings.Loan;
import chapters.chapter11.listings.CircleFromSimpleGeometricObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add(new CircleFromSimpleGeometricObject(15));
        list.add("Welcome");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
