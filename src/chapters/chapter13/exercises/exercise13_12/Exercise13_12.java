package chapters.chapter13.exercises.exercise13_12;

import chapters.chapter13.exercises.exercise13_05.Circle;
import chapters.chapter13.exercises.exercise13_05.GeometricObject;
import chapters.chapter13.exercises.exercise13_05.Rectangle;

public class Exercise13_12 {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[4];
        objects = fillInTheBlank(objects);
        double sum = sumOfArea(objects);
        System.out.println("The sum of area is " + sum);
    }

    private static double sumOfArea(GeometricObject[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getArea();
        }
        return sum;
    }

    private static GeometricObject[] fillInTheBlank(GeometricObject[] objects) {
        objects[0] = new Circle(5);
        objects[1] = new Circle(10);
        objects[2] = new Rectangle(5, 8);
        objects[3] = new Rectangle(9, 3);
        return objects;

    }
}
