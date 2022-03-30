package _01_JAVA.S_OOP._09_Polymorphism.AnimalPack_BothTypes;

public class Cat extends Animal {

    @Override
    void run() {
        System.out.println("Cat is running");
    }

    void makeSound() {
        System.out.println("Meeooww...");
    }
}
