package chapters.chapter13.exercises.exercise13_13;

import java.util.Objects;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course = new Course("NRW");
        course.addStudent("Jack Sparrow");
        course.addStudent("Marget Robie");
        course.addStudent("Charles Jenner");
        Course course1 = (Course) course.clone();
        System.out.println(Objects.equals(course1.getCourseName(), course.getCourseName()));
        System.out.println(course.getStudents() == course1.getStudents());
    }
}
