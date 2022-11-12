package chapters.chapter10.exercises.exercise10_28;

public class MyStringBuilder2 {
    private char[] chars;

    public MyStringBuilder2(String s) {
        this.chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
    }

    public MyStringBuilder2(char[] chars) {
        this.chars = chars;
    }

    public MyStringBuilder2() {
        this("");
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        if (offset < 0 || offset > chars.length) {
            System.out.println("INVALID INPUT!");
            System.exit(1);
        }
        char[] newChar = new char[chars.length + 1];
        for (int i = 0, j = 0; i < newChar.length; i++, j++) {
            if (i == offset) {
                j--;
                continue;
            } else {
                newChar[i] = chars[j];
            }
        }

        newChar[offset] = s.chars[0];
        return new MyStringBuilder2(newChar);
    }

    public MyStringBuilder2 reverse() {
        char[] newChar = new char[chars.length];
        for (int i = chars.length - 1, j = 0; i > 0; i--, j++) {
            newChar[j] = chars[i];
        }
        return new MyStringBuilder2(newChar);
    }

    public MyStringBuilder2 substring(int begin) {
        char[] newChar = new char[chars.length - begin];
        for (int i = 0, j = begin; i < newChar.length; i++, j++) {
            newChar[i] = chars[begin];
        }
        return new MyStringBuilder2(newChar);
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] || chars[i] <= 'z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new MyStringBuilder2(chars);
    }
}
