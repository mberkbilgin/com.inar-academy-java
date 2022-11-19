package chapters.chapter11.exercises.exercise11_10;

public class Test {
    public static void main(String[] args) {
        MyStack myStack1 = new MyStack();
        myStack1.add("ABBA");
        myStack1.add("Billie");
        myStack1.add("Karsu");
        myStack1.add("Minelli");
        myStack1.add("Dua");
        while (myStack1.getSize() != 0){
            System.out.println(myStack1.pop());
        }




    }
}
