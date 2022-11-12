package chapters.chapter10.exercises.exercise10_27;

public class TestMyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1(" MBerkBilgin");
        MyStringBuilder1 myStringBuilder2 = myStringBuilder1.toLowerCase();
        System.out.println(myStringBuilder1.toString());
        System.out.println(myStringBuilder2.toString());

        myStringBuilder1.append(myStringBuilder2);
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder2);
        myStringBuilder1.substring(3,7);
        System.out.println(myStringBuilder1);
        myStringBuilder1.append(2408);
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder1.length());
        System.out.println(myStringBuilder1.charAt(4));
    }
}
