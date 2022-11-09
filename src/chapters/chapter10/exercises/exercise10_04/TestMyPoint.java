package chapters.chapter10.exercises.exercise10_04;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10,30.5);

        System.out.printf("The distance of (%.1f - %.1f) and (%.1f - %.1f) is %.2f",point1.getX(),point1.getY(),point2.getX(),point2.getY(),point1.distance(point2.getX(),point2.getY()));
    }
}
