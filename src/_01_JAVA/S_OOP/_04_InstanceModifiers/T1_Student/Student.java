package _01_JAVA.S_OOP._04_InstanceModifiers.T1_Student;

public class Student {

    private String name;
    private int age;

//    public Student() { }  <- default constructor. after 'public' it doesn't have anything
    private Student() { // we cannot use this constructor to create an object
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
