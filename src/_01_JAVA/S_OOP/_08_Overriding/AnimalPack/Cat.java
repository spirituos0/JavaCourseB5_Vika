package _01_JAVA.S_OOP._08_Overriding.AnimalPack;

public class Cat extends Animal {

    /**
     * Overriding happens in multiple classes
     * To achieve overriding, classes should have parent-child relationship
     * When we override:
     *    Method name and parameters should be same as the super method
     *    We override method in a child class
     *
     *    *** We cannot override static methods
     */

    @Override // annotation
    public void eat() {
        System.out.println("Cat is catching a mouse");
        System.out.println("Cat is eating the mouse");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping.");
        System.out.println("Don't make any noise, because " + name + " will get angry!");
    }

    /**
     * Overloading:
     *   - happens in the same class
     *   - when overloading, method name is same, parameters are different
     * Overriding:
     *   - happens in the multiple classes
     *   - when overriding, methods, parameters, return type etc. are SAME
     */

}
