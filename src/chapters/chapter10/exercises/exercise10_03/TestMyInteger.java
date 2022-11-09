package chapters.chapter10.exercises.exercise10_03;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger integer1 = new MyInteger(5);
        System.out.println("The number is " + integer1.getValue());
        System.out.println("Is this number odd " + integer1.isOdd());
        System.out.println("Is this number even " + integer1.isEven());
        System.out.println("Is this number prime " + integer1.isPrime());
        System.out.println("Does this number equal 10 " + integer1.equals(10));
        System.out.println("Does this number equal MyInteger(10)? " + integer1.equals(new MyInteger(10)));
        System.out.println("Is 52791297 odd " + MyInteger.isOdd(52791297));
        System.out.println("Is 52791297 even " + MyInteger.isEven(52791297));
        System.out.println("Is 52791297 prime " + MyInteger.isPrime(52791297));
        System.out.println("MyInteger.parseInt(new char[]{'1','5','9','6','3','7','2'})  ==>> " + MyInteger.parseInt(new char[]{'1', '5', '9', '6', '3', '7', '2'}));
        System.out.println("MyInteger.parseInt(new String(\"1596374\")  ==>> " + MyInteger.parseInt(new String("1596374")));
    }
}
