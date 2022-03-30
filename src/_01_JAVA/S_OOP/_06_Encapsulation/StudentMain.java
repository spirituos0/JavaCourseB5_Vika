package _01_JAVA.S_OOP._06_Encapsulation;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();

        student.setName("Vika");
        student.setAge(24);
        student.setCountry("Estonia");
        student.setGrade('E');

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Country: " + student.getCountry());
        System.out.println("Grade: " + student.getGrade());


    }
}
