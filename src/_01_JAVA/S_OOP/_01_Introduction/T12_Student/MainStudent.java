package _01_JAVA.S_OOP._01_Introduction.T12_Student;

public class MainStudent {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.studentName = "Almedin";
        student1.studentAge = 25;
        student1.registerCourse();

        Student.printNumberOfStudents(); // now there is only one student registered, so result is 1

        Student student2 = new Student();
        student2.studentName = "Mike";
        student2.studentAge = 35;
        student2.registerCourse();

        Student.printNumberOfStudents(); // now 2 students

    }

}
