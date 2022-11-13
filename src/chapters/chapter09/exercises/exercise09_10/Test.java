package chapters.chapter09.exercises.exercise09_10;

public class Test {
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
