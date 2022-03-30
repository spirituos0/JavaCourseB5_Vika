package _01_JAVA.S_OOP._01_Introduction.T9_StaticMethods;

public class StaticMethods {

    int nonStaticInt = 10;
    static int staticInt = 15;

    public static void staticMethod() {
        System.out.println("This is a static method!");
        // nonStaticMethod(); - this will give an error,
        // because we cannot access non-static methods without creating an object
        staticMethod2(); // able to access because this is a static method
        System.out.println(staticInt); // able to access
    }

    public static void staticMethod2() {
        System.out.println("This is a static method!");
    }

    public void nonStaticMethod() {
        System.out.println("This is a non-static method!");
        staticMethod2(); // static method available
        nonStaticMethod2(); // non static method is available
        System.out.println(staticInt); // static variable is accessible
        System.out.println(nonStaticInt); // non-static variable is accessible
    }

    public void nonStaticMethod2() {
        System.out.println("This is a non-static method!");
    }

}
