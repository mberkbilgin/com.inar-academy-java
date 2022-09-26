package chapters.chapter05.Exercises;

public class Exercise053 {
    public static void main(String[] args) {
        System.out.println("Kilogram        Pounds");
        int kg = 1;
        while(kg < 200){
            double pounds = kg * 2.2;
            System.out.printf("%-15d%6.1f\n",kg,pounds);
            kg +=2;
        }
    }
}
