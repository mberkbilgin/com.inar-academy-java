package chapters.chapter10.exercises.exercise10_02;

public class TestBMI {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Jack",10,70,6,15);
        System.out.println("BMI for " + bmi1.getName() + " is " + bmi1.getStatus());
        System.out.println("_____________________________________");
        BMI bmi2 = new BMI("Eva",34,368,99);
        System.out.println("BMI for " + bmi2.getName() + " is " + bmi2.getStatus());
    }
}
