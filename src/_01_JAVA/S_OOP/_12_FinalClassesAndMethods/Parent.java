package _01_JAVA.S_OOP._12_FinalClassesAndMethods;

public class Parent {

    public void testMethod() {
        System.out.println("Test");
    }

    /**
     * FINAL METHODS CANNOT BE OVERRIDDEN
     */
    public final void finalMethod() {
        System.out.println("Final method");
    }
}
