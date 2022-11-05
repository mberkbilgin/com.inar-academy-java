package chapters.chapter09.exercises;

public class Exercise09_09_RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    Exercise09_09_RegularPolygon(){
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }
    Exercise09_09_RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
    }
    Exercise09_09_RegularPolygon(int n, double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        return (n * (side * side)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Exercise09_09_RegularPolygon polygon1 = new Exercise09_09_RegularPolygon();
        Exercise09_09_RegularPolygon polygon2 = new Exercise09_09_RegularPolygon(6,4);
        Exercise09_09_RegularPolygon polygon3 = new Exercise09_09_RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon-1");
        System.out.println("Perimeter is " + polygon1.getPerimeter());
        System.out.printf("Area is %.3f", polygon1.getArea());
        System.out.println("\n-------------------------------");
        System.out.println("Polygon-2");
        System.out.println("Perimeter is " + polygon2.getPerimeter());
        System.out.printf("Area is %.3f", polygon2.getArea());
        System.out.println("\n-------------------------------");
        System.out.println("Polygon-3");
        System.out.println("Perimeter is " + polygon3.getPerimeter());
        System.out.printf("Area is %.3f", polygon3.getArea());
    }

}
