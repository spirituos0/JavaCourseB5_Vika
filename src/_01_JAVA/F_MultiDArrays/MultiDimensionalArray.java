package _01_JAVA.F_MultiDArrays;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // 1 dimensional array
        int[] arrayOfOddNumbers = { 1, 3, 5, 7, 9 };
        int[] arrayOfEvenNumbers = { 2, 4, 6, 8 };

        // 2 dimensional array
        int[][] listOfLists = { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8 } };

        System.out.println(Arrays.deepToString(listOfLists));

        int[][] multiDArray = new int[2][2]; // first 2 - how many arrays, second 2 - how many elements in one array
        multiDArray[0][0] = 1;
        multiDArray[0][1] = 2;
        multiDArray[1][0] = 3;
        multiDArray[1][1] = 4;

        System.out.println(Arrays.deepToString(multiDArray)); // deepToString for multiDArrays

        /* { {1, 2}, {4, 5}, {6, 7}, {8, 9} }

        int[][] multiDArray2 = new int[4][2];
        System.out.println(); */

        int[][] arrayOfArrays = { {4, 5, 6}, {1, 2, 3}, {7, 8} };

        System.out.println(arrayOfArrays[2][0]);

        System.out.println(Arrays.deepToString(arrayOfArrays));



    }
}
