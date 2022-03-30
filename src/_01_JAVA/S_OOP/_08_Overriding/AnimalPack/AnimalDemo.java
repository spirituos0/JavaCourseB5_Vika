package _01_JAVA.S_OOP._08_Overriding.AnimalPack;

public class AnimalDemo {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Arya";
        cat1.age = 2;

        cat1.eat();
        cat1.sleep();

        System.out.println("************************");

        Dog dog1 = new Dog();
        dog1.name = "Johny";
        dog1.age = 6;

        dog1.eat();
        dog1.sleep();

    }
}
