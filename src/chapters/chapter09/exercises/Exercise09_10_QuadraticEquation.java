package chapters.chapter09.exercises;

import java.sql.SQLOutput;

public class Exercise09_10_QuadraticEquation {
    private int a;
    private int b;
    private int c;

    Exercise09_10_QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    double getDiscriminant(){
        return b * b - (4 * a * c);
    }
    double getRoot1(){
        if(getDiscriminant() >= 0){
            return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        }
        return 0;
    }
    double getRoot2(){
        if(getDiscriminant() >= 0){
            return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        }
        return 0;    }

    public static void main(String[] args) {
        Exercise09_10_QuadraticEquation equation = new Exercise09_10_QuadraticEquation(1,3,1);
        if(equation.getDiscriminant() > 0){
            System.out.println("The equation has two roots " + equation.getRoot1() + " and " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("The equation has one roots " + equation.getRoot1());
        }else{
            System.out.println("The equation has no real roots");
        }
    }
}
