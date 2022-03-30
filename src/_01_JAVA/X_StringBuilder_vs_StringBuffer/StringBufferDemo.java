package _01_JAVA.X_StringBuilder_vs_StringBuffer;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("TechnoStudy");

        str.append(" - Java"); // does not return a new object, it'll update existing object

        System.out.println(str);

        String strConverted = str.toString(); // can convert StringBuffer into a String

        /**
         * StringBuffer is Synchronized (thread-safe)
         * StringBuffer is slower because it's thread-safe
         */

    }
}
