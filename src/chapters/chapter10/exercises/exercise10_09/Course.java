package chapters.chapter10.exercises.exercise10_09;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if(numberOfStudents >= students.length){
            String[] temp = new String[students.length + 2];
            System.arraycopy(students,0,temp,0,students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] == student){
                students[i] = null;
                numberOfStudents--;
                return;
            }
        }
        System.out.println("There is no student named " + student);

    }

    public void clear(){
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        numberOfStudents = 0;
    }
}
