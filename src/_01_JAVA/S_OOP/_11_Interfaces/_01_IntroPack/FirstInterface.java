package _01_JAVA.S_OOP._11_Interfaces._01_IntroPack;

public interface FirstInterface {

    /**
     1. 'public' and 'abstract' keywords are unnecessary,
          because all methods are public and abstract by default
     2. Variables in Interface are "public", "static" and "final"
     3. When you inherit code from interface you should override(implement) all the methods
     4. Like abstract classes, Interfaces cannot be used to create objects
     5. Interface methods do NOT have body (body provided by the "implementing" class)
     6. On implementation of Interface all methods should be overridden:
          - an interface cannot have a Constructor, because it has body, which interface cannot contain
     7. Interfaces cannot be declared as 'private' or 'protected'
     */

    public void method(); // <- 'public' keyword is unnecessary

    abstract void method2(); // <- abstract keyword is unnecessary:

    void method3(); // = public abstract void method3();

    // Variables in interface are "public", "static" and "final" by default:
    public int variable1 = 10;
    static double variable2 = 3;
    final boolean variable3 = false;

    char variable4 = 'T'; // = public static final char variable4 = 'T';

    /**
     *
     */

}
