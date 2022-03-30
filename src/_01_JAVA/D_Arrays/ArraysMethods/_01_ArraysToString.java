package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _01_ArraysToString {

    public static void main(String[] args) {

        int[] arrayOfInts = new int[100];

        arrayOfInts[0] = 5;
        arrayOfInts[99] = 10;

        System.out.println(Arrays.toString(arrayOfInts));
        // lastIndex = lengthOfArray - 1

        int lastIndex = arrayOfInts.length - 1;

        arrayOfInts[lastIndex] = 30;

        System.out.println(Arrays.toString(arrayOfInts));

        /* example:
        int[] arr = new int[5]; -> 4 - last index
        int[] arr1 = new int[10]; -> 9 last index
        int[] arr2 = new int[2]; -> 1 last index */




    }
}
