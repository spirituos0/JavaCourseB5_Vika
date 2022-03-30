package _01_JAVA.S_OOP._10_Abstract._03_AnimalPack;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Dog is chewing a bone");
    }
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
    @Override
    public void move() {
        System.out.println("Dog is playing with the ball");
    }
}
