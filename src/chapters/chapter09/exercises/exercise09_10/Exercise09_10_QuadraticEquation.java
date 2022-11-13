package chapters.chapter09.exercises.exercise09_10;

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


}
