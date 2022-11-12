package chapters.chapter10.exercises.exercise10_24;

public class MyCharacter {
    private char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public char charValue() {
        return ch;
    }

    public static MyCharacter valueOf(char ch) {
        return new MyCharacter(ch);
    }

    public static int compare(char ch1, char ch2) {
        return ch1 - ch2;
    }

    public int compareTo(MyCharacter ch) {
        return charValue() - ch.charValue();
    }

    public boolean equals(MyCharacter ch) {
        if (compareTo(ch) == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isLetter(ch) || isDigit(ch);
    }

    public static char toUpperCase(char ch) {
        if ('a' < ch || ch < 'z') {
            return (char) (ch - 32);
        } else
            return ch;
    }

    public static char toLowerCase(char ch) {
        if (ch <= 'Z' && ch >= 'A') {
            return (char) (ch + 32);
        } else
            return ch;
    }

    public static boolean isLowerCase(char ch) {
        return ('a' <= ch && ch <= 'z');
    }

    public static boolean isUpperCase(char ch) {
        return ('A' <= ch && ch <= 'Z');
    }
}
