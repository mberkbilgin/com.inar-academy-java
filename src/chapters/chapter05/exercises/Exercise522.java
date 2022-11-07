package chapters.chapter05.exercises;

    import java.util.Scanner;

    public class Exercise522 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter loan amount: ");
            int loanAmount = input.nextInt();

            System.out.println("Enter number of years: ");
            int numberOfYears = input.nextInt() ;

            System.out.println("Enter annual interest rate: ");
            double annualRate = input.nextInt() ;

            double monthlyRate = annualRate / 1200 ;

            double monthlyPayment = loanAmount*monthlyRate/(1-1/Math.pow(1+monthlyRate, numberOfYears*12));
            double totalPayment = monthlyPayment * numberOfYears * 12 ;

            System.out.printf("Monthly Payment: %-5.2f\n",monthlyPayment);
            System.out.printf("Total Payment: %-7.2f %n",totalPayment);

            double balance = loanAmount;
            System.out.printf("%n%5s%20s%20s%20s\n\n","Payment#","Interest","Principal","Balance");

            for (int i = 1; i <= numberOfYears * 12 ;  i++) {
                double interest = monthlyRate *  balance ;
                double principal = monthlyPayment - interest ;
                balance = balance - principal ;
                System.out.printf("%-5d%20.2f%20.2f%23.2f \n", i , interest , principal , balance);
            }


        }

    }
