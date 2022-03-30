package _01_JAVA.S_OOP._09_Polymorphism.AnimalPack_BothTypes;

public class AnimalDemo {

    public static void main(String[] args) {

        Animal animal1 = new Cat();
        animal1.run();
        animal1.makeSound();

        System.out.println("----------");

        Animal animal2 = new Dog();
        animal2.run(50);
        animal2.makeSound();

        System.out.println("----------");

        Animal animal3 = new Horse();
        animal3.run(100, "meters");
        animal3.makeSound();

        System.out.println("------------------------");
// ______________________________________

        Animal[] animals = {new Dog(), new Cat(), new Horse()};

        // Iterate animals array using for-each loop
        for (Animal animal : animals) {
            animal.makeSound();
        }
        // Iterate animals array using for loop - and call makeSound() method
        for (int i = 0; i < animals.length; i++) {
            animals[i].makeSound();
        }

    }

}
