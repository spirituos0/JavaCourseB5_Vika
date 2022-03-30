package _01_JAVA.C_StringMethods;

public class _06_IndexOf {

    public static void main(String[] args) {

        String welcomeMessage = "Welcome to TechnoStudy!";

        int indexOfS = welcomeMessage.indexOf("S");
        /* if we count, index of S is 18
        But Java shows 17, because index of W is 0
        So index starts from 0 */

        System.out.println(indexOfS);

        // example:
        int indexOfW = welcomeMessage.indexOf("W");

        System.out.println(indexOfW);

        welcomeMessage.indexOf('o', 5);

        System.out.println(indexOfS);

        System.out.println(welcomeMessage.indexOf('o', 10));



    }

}
