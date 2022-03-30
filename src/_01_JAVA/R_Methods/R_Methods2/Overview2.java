package _01_JAVA.R_Methods.R_Methods2;

public class Overview2 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        printIntArray(array1);

        int[] array2 = {15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        printIntArray(array2);

        String[] cities = { "New York", "Paris", "Amsterdam", "London", "Genk"};
        printStringArray(cities);

    }
// Instead of writing code several times,
// we call this method below and just assign different names into this 'formula'

    public static void printIntArray(int[] array) {
        for (int i = 0; i <= array.length-1; i++)
            System.out.println(array[i]);
    }

    public static void printStringArray(String[] array) {

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
