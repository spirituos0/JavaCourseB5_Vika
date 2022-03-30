package _01_JAVA.S_OOP._04_InstanceModifiers.T1_Student;

public class MainStudent {

    public static void main(String[] args) {

//        Student student1 = new Student(); // this one is private, we cannot use it

        Student student2 = new Student("Vika", 24);  // this we can use, cuz it's public

//        student2.age;
//        student2.name;
        // these fields are private, so we cannot access them

    }

}
