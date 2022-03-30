package _01_JAVA.S_OOP._10_Abstract._01_IntroPack;
// using keyword 'abstract' we make it abstract
public abstract class AbstractClass {

    /**
     *   ABSTRACT KEYWORD
     *    1. Abstract classes cannot be used to create objects
     *    2. Abstract class can have both Abstract and non-abstract methods
     *    3. Abstract methods don't have body, but will require when inherited
     */

    public void nonAbstractMethod() {
        System.out.println("This is Non-Abstract Method");
    }

    public abstract void abstractMethod(); // - does not have body {}

    public abstract void abstractMethod(int number);

//    private abstract void privateAbsMethod(); // <- we cannot create PRIVATE abstract method

//    final public abstract void finalAbsMethod(); // <- we cannot create FINAL abstract method

//    public static abstract void staticAbsMethod(); <- we cannot create STATIC abstract method

}
