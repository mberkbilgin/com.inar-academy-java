package chapters.chapter09.exercises.exercise09_09;

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



}
