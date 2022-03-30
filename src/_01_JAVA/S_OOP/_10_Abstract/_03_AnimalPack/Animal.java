package _01_JAVA.S_OOP._10_Abstract._03_AnimalPack;

public abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // we made these methods to hide the implementation.
    // then while writing child classes for specific animals,
    // we will override it and make specific code for each animal
    public abstract void eat();

    public abstract void makeSound();

    public abstract void move();
}
