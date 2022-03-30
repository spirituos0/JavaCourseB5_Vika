package _01_JAVA.S_OOP._09_Polymorphism.AnimalPack_BothTypes;

public class Dog extends Animal {

    @Override
    void run() {
        System.out.println("Dog is running");
    }
    void makeSound() {
        System.out.println("Woof-woof");
    }

}
