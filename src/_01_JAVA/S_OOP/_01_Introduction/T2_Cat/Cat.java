package _01_JAVA.S_OOP._01_Introduction.T2_Cat;
/*
TASK - OOP Intro (Objects and Classes)

  Part 1
    1-Create a class called Cat with
       2 properties and 1 method that prints "Meow" sound

    2-Create 2 objects of this class,
       set their properties and call their methods


  Part 2
    Create a method in Cat class to print cat properties


  Part 3
    Create a static method in Main class to print cat properties
        hint: public static void print(Cat cat) {}

 */
public class Cat {

    String color;
    int age;

    void meows() {
        System.out.println("Meeooowww");
    }

    void printProperties() {
        System.out.println("Color: " + color + "\nAge: " + age);
    }
}

