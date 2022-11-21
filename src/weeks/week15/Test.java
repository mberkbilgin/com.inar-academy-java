package weeks.week15;

public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5);
        calculator.add(5);
        System.out.println(calculator);
        calculator.extract(2);
        System.out.println(calculator);
        calculator.multiply(6);
        System.out.println(calculator);
        calculator.divide(8);
        System.out.println(calculator);
        
    }
}
