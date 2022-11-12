package chapters.chapter10.exercises.exercise10_22;

import java.util.Scanner;

public class TestMyString1 {
    public static void main(String[] args) {
        MyString1 myString1 = new MyString1(new char[]{'I','N','A','R'});
        System.out.println(myString1.toString());
        System.out.println(myString1.charAt(3));
        System.out.println(myString1.length());
        System.out.println(myString1.substring(1,3).toString());
        System.out.println(myString1.toLowerCase().toString());
        System.out.println(myString1.equals(new MyString1(new char[]{'A','C','A','D','E','M','Y'})));
        MyString1 myString2 = MyString1.valueOf(65464);
        System.out.println(myString2);
    }

}
