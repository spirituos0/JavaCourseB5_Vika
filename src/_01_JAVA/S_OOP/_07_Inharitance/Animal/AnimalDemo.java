package _01_JAVA.S_OOP._07_Inharitance.Animal;

public class AnimalDemo {

    public static void main(String[] args) {

        Animal animal = new Animal("Cinnamon", 4);

        animal.eat();
        animal.sleep();

        Cat cat = new Cat("Red", 1);

        cat.eat();
        cat.sleep();
        cat.catchFly();
        System.out.println(cat.name);
        System.out.println(cat.age);

        Dog dog = new Dog("Cooper", 7);
        dog.eat();
        dog.sleep();
        dog.lickOwner();

        Bird bird = new Bird("Zazu", 1, "red");
        bird.sizeOfWings = 5.5;

        // from parent
        bird.eat();
        bird.sleep();

        // from bird class
        bird.sing();
        bird.fly();

        Horse horse = new Horse("Bella", 2, "white");
        horse.weight = 890;
        horse.yell();
        horse.gallop();
    }
}
