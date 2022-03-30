package _01_JAVA.S_OOP._10_Abstract._03_AnimalPack;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating a fish");
    }
    @Override
    public void makeSound() {
        System.out.println("Meeooowww...");
    }
    @Override
    public void move() {
        System.out.println("Cat is moving");
    }

}
