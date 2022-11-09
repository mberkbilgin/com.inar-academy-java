package chapters.chapter10.exercises.exercise10_05;

public class TestingStackOfIntegers {
    public static void main(String[] args) {
        StackOfIntegers integers = new StackOfIntegers(120);
        System.out.println("The number " + integers.getNumber() + "'s the prime factors is \n" + integers.reverseFactor());
    }
}
