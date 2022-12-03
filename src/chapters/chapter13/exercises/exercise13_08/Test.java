package chapters.chapter13.exercises.exercise13_08;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyStack myStack1 = new MyStack();
        myStack1.push(212);
        myStack1.push("vip");
        myStack1.push(true);


        MyStack myStack2 = (MyStack) myStack1.clone();
        myStack1.push("kalem");
        System.out.println(myStack1);
        System.out.println("________________________");
        System.out.println(myStack2);

    }
}
