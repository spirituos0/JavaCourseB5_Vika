package _01_JAVA.S_OOP._09_Polymorphism.CompileTime;

public class Main {

    public static void main(String[] args) {

        /**
         * Compile Time Polymorphism (Static Polymorphism)
         *   - achieved by METHOD OVERLOADING
         */

        // we call 4 different sum methods:

        Calculation.sum(5, 9);            // accepts 2 integers
        Calculation.sum(6, 13, 7);        // accepts 3 integers
        Calculation.sum(33.867, 12.34);   // accepts 2 doubles
        Calculation.sum(8.4, 1.98, 44.4); // accepts 3 doubles

        Calculation.multiplication(5, 9);
        Calculation.multiplication(6, 13, 7);
        Calculation.multiplication(33.867, 12.34);
        Calculation.multiplication(8.4, 1.98, 44.4);

        Calculation.subtract(63, 10);
        Calculation.subtract(91, 7, 33);
        Calculation.subtract(74.92, 3.456);
        Calculation.subtract(84.02, 1.98, 44.4);
    }
}
