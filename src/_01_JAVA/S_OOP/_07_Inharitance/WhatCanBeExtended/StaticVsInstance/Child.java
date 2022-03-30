package _01_JAVA.S_OOP._07_Inharitance.WhatCanBeExtended.StaticVsInstance;

public class Child extends Parent {
    /**
     * All the methods and fields are accessible from child class, unless it's private
     */

    public void instanceMethos() {
//        System.out.println(privateVariable);
//        <- we still cannot access this private field
        System.out.println(defaultVariable);
        System.out.println(protectedVariable);
        System.out.println(publicVariable);

        System.out.println(staticVariable); // STATIC fields are accessible when you extend
        // unless it's private!

        System.out.println(finalVariable); // FINAL fields are accessible when you extend
        // unless it's private
    }

    public static void staticMethod() {
        /**
         * STATIC METHODS:
         *  CAN ONLY ACCESS STATIC VARIABLES AND METHODS
         *  CANNOT ACCESS INSTANCE FIELDS AND METHODS
         */
//        System.out.println(privateVariable);
//        System.out.println(defaultVariable);
//        System.out.println(protectedVariable);
//        System.out.println(publicVariable);

        /*
        we cannot access these variables, because they belong to the object,
        we need to create an object to access them, which does not make sense in this case
         */

        System.out.println(staticVariable);
//        System.out.println(finalVariable);
//        <- we cannot access it, because it's an instance variable
    }

}
