package chapters.chapter10.exercises.exercise10_03;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isOdd() {
        if (getValue() % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean isEven() {
        if (getValue() % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean isPrime() {
        if (getValue() == 0 || getValue() == 1) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value) {
        if (value == 0 || value == 1) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(MyInteger value) {
        if (value.isOdd()) {
            return true;
        }
        return false;
    }

    public static boolean isEven(MyInteger value) {
        if (value.isEven()) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(MyInteger value) {
        if (value.isPrime()) {
            return false;
        }
        return true;
    }

    public boolean equals(int value) {
        if (this.value == value) {
            return true;
        }
        return false;
    }

    public boolean equals(MyInteger value) {
        if (this.value == value.getValue()) {
            return true;
        }
        return false;
    }

    public static int parseInt(char[] ch) {
        return Integer.parseInt(new String(ch));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}