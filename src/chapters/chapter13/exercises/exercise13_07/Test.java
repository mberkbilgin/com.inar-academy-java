package chapters.chapter13.exercises.exercise13_07;


import chapters.chapter13.exercises.exercise13_06.Circle;
import chapters.chapter13.exercises.exercise13_06.GeometricObject;

public class Test {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[2];
        objects[0] = new Square(4);
        objects[1] = new Circle(4);
        for (int i = 0; i < objects.length; i++) {
            System.out.println("Area of object-" + (i + 1) + " is " + objects[i].getArea());
            if (objects[i] instanceof Colorable) {
                ((Colorable) objects[i]).howToColor();
            }
            System.out.println("_______________________________");
        }
    }
}
