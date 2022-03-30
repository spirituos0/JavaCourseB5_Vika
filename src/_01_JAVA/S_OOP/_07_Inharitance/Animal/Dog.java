package _01_JAVA.S_OOP._07_Inharitance.Animal;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }
    public void lickOwner() {
        System.out.println("Dog is licking its owner");
    }
}
