package chapters.chapter10.exercises.exercise10_10;

public class TestQueue {
    public static void main(String[] args) {
    Queue queue = new Queue();
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
        }
        while(queue.getSize() != 0)
        System.out.println(queue.dequeue());

    }
}
