package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _05_ArrayBinarySearch {

    public static void main(String[] args) {

        int[] intArray = { 25, 10, 45, 5, 35, 90, 0 };
        // with this method we can find index of a specific value

        Arrays.sort(intArray); // important to sort!

        Arrays.binarySearch(intArray, 35);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.binarySearch(intArray, 35));


    }
}
