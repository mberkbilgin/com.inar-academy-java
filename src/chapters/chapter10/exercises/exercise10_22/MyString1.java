package chapters.chapter10.exercises.exercise10_22;

public class MyString1 {
    private char[] chars;

    public MyString1() {
        this(null);
    }

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public char[] getChars() {
        return chars;
    }

    public void setChars(char[] chars) {
        this.chars = chars;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            System.out.println("INVALID INPUT");
            System.exit(-1);
        }
        int length = end - begin;
        char[] newChar = new char[length];
        for (int i = 0, k = begin; i < newChar.length; i++, begin++) {
            newChar[i] = chars[begin];
        }
        MyString1 substring = new MyString1(newChar);
        return substring;
    }

    public MyString1 toLowerCase() {
        for (int i = 0; i < chars.length; i++) {
            if ((int) chars[i] < 97 && (int) chars[i] > 64) {
                chars[i] = (char) ((int) chars[i] + 32);
            }
        }
        MyString1 LowCase = new MyString1(chars);
        return LowCase;
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        int count = 0;
        int number = i;
        while (i > 0) {
            i /= 10;
            count++;
        }
        char[] chars1 = new char[count];
        for (int j = chars1.length - 1; j >= 0; j--) {
            chars1[j] = (char) ('0' + (i % 10));
            number /= 10;
        }
        MyString1 string1 = new MyString1(chars1);
        return string1;

    }
}