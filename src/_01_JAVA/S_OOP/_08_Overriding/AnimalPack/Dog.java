package _01_JAVA.S_OOP._08_Overriding.AnimalPack;

public class Dog extends Animal {


    @Override
    public void eat() {
        System.out.println((name + " is eating food."));
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
        System.out.println("ZzzZzzZzz...");
    }

}
