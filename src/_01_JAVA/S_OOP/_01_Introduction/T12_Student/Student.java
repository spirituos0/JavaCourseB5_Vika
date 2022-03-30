package _01_JAVA.S_OOP._01_Introduction.T12_Student;

public class Student {

    String studentName;
    int studentAge;

    static int numberOfStudentsEnrolledToCourse = 0;

    void registerCourse() {
        numberOfStudentsEnrolledToCourse++;
    }

    static void printNumberOfStudents() {
        System.out.println("Number of students enrolled to a course: " + numberOfStudentsEnrolledToCourse);
    }

}
