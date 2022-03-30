package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _01_ArraysToStringTask {

    public static void main(String[] args) {

        int[] arrayOfInts = { 25, 78, 6, 39 };

        System.out.println(Arrays.toString(arrayOfInts));

        // to swap first and last elements:
        // option 1
        arrayOfInts[0] = 39; // updated
        arrayOfInts[3] = 25;


        // option 2. Better solution
        int lastIndex = arrayOfInts.length-1;
        int valueIndex0 = arrayOfInts[0];
        int valueLastIndex = arrayOfInts[lastIndex];

        arrayOfInts[0] = valueLastIndex; // { 39, 78, 6, 39 }
        arrayOfInts[lastIndex] = valueIndex0; // { 39, 78, 6, 25 }

        System.out.println(Arrays.toString(arrayOfInts));





    }
}
