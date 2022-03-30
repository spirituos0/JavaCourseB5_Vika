package _01_JAVA.S_OOP._09_Polymorphism.AnimalPack_BothTypes;

public class Horse extends Animal {

    @Override
    void run() {
        System.out.println("Horse is running");
    }
    @Override
    void makeSound() {
        System.out.println("Neeiiigghhh...");
    }
}
