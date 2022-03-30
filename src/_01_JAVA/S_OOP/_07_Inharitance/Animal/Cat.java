package _01_JAVA.S_OOP._07_Inharitance.Animal;

public class Cat extends Animal {
    // now Cat is 'child' of Animal class and has access to the fields

    // we call the constructor from animal to be able to initialize name and age
    public Cat(String name, int age) {
        super(name, age);
    }
    public void catchFly() {
        System.out.println("Cat is catching the fly");
    }





}
