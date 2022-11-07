package chapters.chapter05.listings;

public class Listing057 {
    public static void main(String[] args) {
        String str = "Multiplication Table";
        System.out.printf("%35s%n",str);

        System.out.print("  ");
        for(int i = 1; i <= 9; i++){
            System.out.print("    "+i);
        }
        System.out.println("\n_________________________________________________________");
        for (int k = 1; k <= 9; k++){

            System.out.print(k+"|");
            for(int j = 1; j <= 9; j++ ){
                System.out.printf("%5d",k*j);

        }
            System.out.println();




        }

    }
}
