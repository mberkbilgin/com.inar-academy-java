package chapters.chapter12.exercises.exercise12_08;

public class HexFormatException extends Throwable {
    public HexFormatException(String s) {
        super(s);
    }

    public HexFormatException() {
        super("INVALID INPUT!");
    }
}
