package _01_JAVA.S_OOP._01_Introduction.T8_UsefulMethods;

public class UsefulMethods {

    public static void printArray(int[] array) {
        // we need to put the parameter to let Java know what array to print
        for (int number : array) {
            System.out.println(number);
        }
    }

    // sum numbers
    public static void sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

}
