package chapters.chapter12.exercises.exercise12_04;

public class Test {
    public static void main(String[] args) {
        try {
            Loan loan1 = new Loan();
            Loan loan2 = new Loan(41, 8, 48651);
            Loan loan3 = new Loan(0,-5,46168);
            System.out.println(loan1);
            System.out.println(loan2);
            System.out.println(loan3);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }

    }
}
