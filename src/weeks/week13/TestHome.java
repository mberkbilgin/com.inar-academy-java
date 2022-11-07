package weeks.week13;

public class TestHome {
    public static void main(String[] args) {
        Home home1 = new Home();
        home1.print();
        System.out.println("------------------------------");
        Home home2 = new Home(140,2,5,true,250_000,1000,"North",2022);
        home2.print();
    }
}
