package chapters.chapter10.exercises.exercise10_05;

public class StackOfIntegers {
    private int number;
    private String factor;

    public StackOfIntegers(int number) {
        this.number = number;
        this.factor = "";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String reverseFactor() {
        int i = 2;
        while (getNumber() != 1) {
            if (getNumber() % i == 0) {
                while (getNumber() % i == 0) {
                    factor += i + ",";
                    setNumber(getNumber() / i);
                }
            } else {
                i++;
            }
        }
        return factor;
    }

}
