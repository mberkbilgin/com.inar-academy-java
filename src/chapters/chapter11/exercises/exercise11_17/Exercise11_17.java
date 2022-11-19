package chapters.chapter11.exercises.exercise11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer m:");
        int number = input.nextInt();
        ArrayList<Integer> factors = factors(number);
        ArrayList<Integer> oddFactors = whichOdd(factors);
        System.out.printf("The smallest number n for m * n to be a perfect square is %d \n",multiply(oddFactors));
        System.out.printf("m * n is %d ",(multiply(oddFactors) * number));

    }

    public static int multiply(ArrayList<Integer> oddFactors) {
    int number = 1;
        for (int i = 0; i < oddFactors.size(); i++) {
            number *= oddFactors.get(i);
        }
        return number;
    }

    public static ArrayList<Integer> whichOdd(ArrayList<Integer> factors) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < factors.size(); i++) {
            int count = 1;
            for (int j = 0; j < factors.size(); j++) {
                if(i != j && factors.get(i) == factors.get(j)){
                    count++;
                }
            }
            if(count % 2 != 0){
                if(!odd.contains(factors.get(i))){
                    odd.add(factors.get(i));
                }
            }
        }
        return odd;
    }

    public static ArrayList<Integer> factors(int number) {
        int div = 2;
        ArrayList<Integer> list = new ArrayList<>();
        while(number != 1){
            if(number % div == 0){
                list.add(div);
                number /= div;
            }else{
                div++;
            }
        }
        return list;
    }
}
