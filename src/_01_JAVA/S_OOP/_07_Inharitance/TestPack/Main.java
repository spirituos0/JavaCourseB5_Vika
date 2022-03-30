package _01_JAVA.S_OOP._07_Inharitance.TestPack;

public class Main {

    public static void main(String[] args) {

        Test test = new Test();
/*        test.  <- when we type this, we can see some members,
          that are not written in the Test class.
          But the reason is that in Java we have object oriented class,
          that has these members */
        /**
         * methods come from Object class (hasCode, toString...)
         * we don't have any methods in 'Test' class and it does not extend from anywhere
         * but we still have some methods which are coming from Object class
         *
         * *** Every class inherits from Object class
         */

        test.hashCode();
        test.toString();
    }
}
