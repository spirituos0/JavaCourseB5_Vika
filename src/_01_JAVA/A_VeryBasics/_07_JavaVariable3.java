package _01_JAVA.A_VeryBasics;

public class _07_JavaVariable3 {

    public static void main(String[] args) {

        int year = 2021;
        int month = 10;

        // or
        // int year = 2021, month = 10;
        // but better not to do that, can be confusing

        System.out.println(year);

        year = 2022;
        // variable is updated
        // No need to put 'int' again, just update.
        // Otherwise, Java thinks I am trying to create a new variable

        System.out.println(year);

    }
}
