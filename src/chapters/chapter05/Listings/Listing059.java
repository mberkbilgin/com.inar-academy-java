package chapters.chapter05.Listings;

import java.util.Scanner;

public class Listing059 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two integer:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        int gcd = 1;

        for(int i = 2; i <= n1 && i <= n2; i++){
            if(n1 % i == 0 && n2 % i == 0 ){
                gcd = i ;
            }

        }
        System.out.println("Great common divisor for "+n1+" and "+n2+" is "+gcd);
    }
}
