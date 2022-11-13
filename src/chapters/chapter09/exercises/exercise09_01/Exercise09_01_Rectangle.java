package chapters.chapter09.exercises.exercise09_01;

public class Exercise09_01_Rectangle {
    double width;
    double height;

    Exercise09_01_Rectangle() {
        width = 1;
        height = 1;
    }

    Exercise09_01_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea(){
        return width * height;
    }
    double getPerimeter(){
        return 2 * (width + height);
    }


}
