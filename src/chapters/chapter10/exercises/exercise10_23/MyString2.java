package chapters.chapter10.exercises.exercise10_23;

public class MyString2 {
    private char[] chars;

    public MyString2(String s) {
        this.chars = s.toCharArray();
    }

    public int compare(String s) {
        int number1 = 0;
        for (int i = 0; i < this.chars.length; i++) {
            number1 += this.chars[i];
        }
        int number2 = 0;
        for (int i = 0; i < s.length(); i++) {
            number2 += s.charAt(i);
        }
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public MyString2 substring(int begin) {
        char[] chars1 = new char[chars.length - begin];
        for (int i = 0, j = begin; i < chars1.length; i++, j++) {
            chars1[i] = chars[j];
        }
        String str = chars1.toString();

        return new MyString2(str);
    }

    public MyString2 toUpperCase() {
        for (int i = 0; i < chars.length; i++) {
            if ('a' <= chars[i] || chars[i] <= 'z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        String str = chars.toString();
        return new MyString2(str);

    }
}
