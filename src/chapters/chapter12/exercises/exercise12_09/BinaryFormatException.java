package chapters.chapter12.exercises.exercise12_09;

public class BinaryFormatException extends Throwable {
    public BinaryFormatException() {
        this("INVALID INPUT!");
    }

    public BinaryFormatException(String message) {
        super(message);
    }
}
