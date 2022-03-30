package _01_JAVA.S_OOP._10_Abstract._01_IntroPack;

public class ChildClass extends AbstractClass {

    // necessary step.
    // If we don't override, then it won't work, cuz the original method does not have body
    @Override
    public void abstractMethod() {
        System.out.println("Child class overrode abstract method");
    }

    @Override
    public void abstractMethod(int number) {

    }

}
