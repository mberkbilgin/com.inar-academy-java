package chapters.chapter11.exercises.exercise11_05;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<String> students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void dropStudent(String student) {
        if (students.contains(student)) {
            students.remove(student);
            numberOfStudents--;
        } else {
            System.out.println("There isn't student named \"" + student + "\"");
        }
    }
}
