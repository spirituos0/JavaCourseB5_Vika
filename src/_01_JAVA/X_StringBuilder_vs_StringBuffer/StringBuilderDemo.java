package _01_JAVA.X_StringBuilder_vs_StringBuffer;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("TechnoStudy");

        str.append(" - Java"); // doesn't return a new object, it updates an existing one

        System.out.println(str);

        String strConverted = str.toString(); // can convert into a string

        /**
         1. String Builder is same as the StringBuffer, that is it can be modified, it will not create a new object

         2. The main difference between StringBuffer and StringBuilder is that Builder is also not thread safe.
         StringBuilder is fast as it is not thread safe

         3. StringBuilder can be converted to the string by using toString() method.
         */

    }

}
