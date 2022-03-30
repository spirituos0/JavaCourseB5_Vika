package _01_JAVA.S_OOP._07_Inharitance.Animal;

public class Animal {

    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("ZzZzZzZzzz...");
    }
    public void eat() {
        System.out.println("Nom Nom Nom...");
    }


}
