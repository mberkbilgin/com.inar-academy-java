package chapters.chapter10.exercises.exercise10_10;

public class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }


    public int dequeue() {
        int n = elements[0];
        for (int i = 1; i < getSize(); i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return n;

    }

    public boolean empty() {

        return size == 0;
    }

    public int getSize() {

        return size;
    }
}
