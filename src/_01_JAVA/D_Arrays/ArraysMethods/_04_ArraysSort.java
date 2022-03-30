package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _04_ArraysSort {

    public static void main(String[] args) {

        int[] integerArray = new int[12];
        integerArray[0] = 98;
        integerArray[1] = 667;
        integerArray[2] = 28;
        integerArray[3] = 312;
        integerArray[4] = 9999;
        integerArray[5] = 43;
        integerArray[6] = 111;
        integerArray[7] = 9;
        integerArray[8] = 68;
        integerArray[9] = 398;
        integerArray[10] = 1;
        integerArray[11] = 53;
        // arrays allow same values(numbers)
        System.out.println(Arrays.toString(integerArray));

        Arrays.sort(integerArray);
        System.out.println(Arrays.toString(integerArray)); // not it's sorted

        System.out.println("Min value in Array: " + integerArray[0]); // value of the index 0
        System.out.println("Max value in Array: " + integerArray[integerArray.length-1]); // value of the last index







    }
}
