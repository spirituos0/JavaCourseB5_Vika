package _01_JAVA.S_OOP._10_Abstract._03_AnimalPack;

public class AnimalDemo {

    public static void main(String[] args) {

//        Animal animal = new Animal("Blah", 4); <- we cannot create an obstract object

        Animal cat = new Cat("Arya", 1);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        cat.eat();
        cat.makeSound();
        cat.move();

        System.out.println("-----------");

        Animal dog = new Dog("Luna", 3);

        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        dog.eat();
        dog.makeSound();
        dog.move();

    }
}
