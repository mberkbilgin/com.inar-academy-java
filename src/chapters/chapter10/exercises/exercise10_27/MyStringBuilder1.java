package chapters.chapter10.exercises.exercise10_27;

public class MyStringBuilder1 {
    private char[] chars;

    public MyStringBuilder1(String s) {
        this.chars = new char[s.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.charAt(i);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        char[] newChar = new char[chars.length + s.length()];
        for (int i = 0; i < chars.length; i++) {
            newChar[i] = chars[i];
        }
        for (int i = chars.length, j = 0; i < newChar.length; i++, j++) {
            newChar[i] = s.charAt(j);
        }
        String str = newChar.toString();
        return new MyStringBuilder1(str);
    }


    public MyStringBuilder1 append(int i) {
        int count = 0;
        int number = i;
        while (i > 0) {
            i /= 10;
            count++;
        }
        char[] newChar = new char[chars.length + count];
        for (int k = 0; k < chars.length; k++) {
            newChar[k] = chars[k];
        }
        for (int j = newChar.length - 1; j >= chars.length; j--) {
            newChar[j] = (char) (number % 10);
            number /= 10;
        }
        return new MyStringBuilder1(newChar.toString());
    }


    public int length() {
        return chars.length;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] || chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new MyStringBuilder1(chars.toString());
    }

    public MyStringBuilder1 substring(int begin, int end){
        if (begin < 0 || end > chars.length || begin > end) {
            System.out.println("INVALID INPUT");
            System.exit(1);
        }
        char[] newChar = new char[end - begin];
        for (int i = 0,j = begin; i < newChar.length; i++, j++) {
            newChar[i] = chars[begin];
        }
        return new MyStringBuilder1(newChar.toString());
    }
    public String toString(){
        return String.valueOf(chars);
    }
}
