package _01_JAVA.S_OOP._01_Introduction.T1_Dog;
// OOP - Object Oriented Programming
public class Dog { // This class is a template
    // I cannot run this code

    // Properties of a dog - Fields

    String breed;
    String size;
    int age;
    String color;
    boolean isSleeping;

    // Behaviour of the dog - Methods
    void eat() {
        System.out.println("The dog is eating!");
    }

    void sleep() {
        isSleeping = true;
    }

    void wakeUp() {
        isSleeping = false;
    }

    void snoring() {
        if (isSleeping)
            System.out.println("ZzZzZzZzZz...");
    }
}
