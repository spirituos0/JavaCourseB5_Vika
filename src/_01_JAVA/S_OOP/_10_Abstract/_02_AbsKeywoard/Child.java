package _01_JAVA.S_OOP._10_Abstract._02_AbsKeywoard;

public abstract class Child extends Parent {
    // if we make Child class abstract, we don't need to implement 2 parent abstract methods

    @Override
    public void abstractMethod1() {
        System.out.println("Implemented!");
    }
}
