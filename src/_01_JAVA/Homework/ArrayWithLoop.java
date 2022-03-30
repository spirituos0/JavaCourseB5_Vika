package _01_JAVA.Homework;

import java.util.Arrays;

public class ArrayWithLoop {

    public static void main(String[] args) {

        // 1
        int[] array1 = {26, 131, 545, 1, 59, 912, 32, 52};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // 2
        char[] array2 = {'2', 'h', '@', 'F', '0', 'q', 'l', 'V', '1'};

//        for (int i = 0; i < array2.length; i++) {
//            System.out.println(i + ": " + array2[i]);
//
//        }
        for (int i = 0; i < array2.length; i++) {
            if (i < array2.length-1)
                continue;
            System.out.println("2. Length of the char array is: " + (i+1));
        }

        // 3
        String[] array3 = {"Apple" , "Orange" , "Banana" , "Pineapple"};
        Arrays.sort(array3);

        for (String banana : array3) {
            if (banana.contains("Banana")) {
                System.out.println(banana);
            }
        }

        // my first solution before I found better one above:

//        int indexOfBanana = Arrays.binarySearch(array3, "Banana");
//        for (int i = 0; i < array3.length; i++) {
//            if (i < indexOfBanana || i > indexOfBanana) {
//                System.out.println("Array contains Banana");
//                continue;
//            }
//            else {
//                System.out.println("Array doe not contain Banana");
//            }
//        }

        // 4
        int[] array4 = {12, 583, 23, 1, 94, 23, 77, 33, 10, 67};

        int sum = 0;

        for (int i = 0; i < array4.length; i++) {
            sum += array4[i];
        }
        double avg = (double) sum / array4.length;
        System.out.println("Average of numbers in the array: " + avg);


        // 5
        int[] array5 = {12 , 2 , 5 , 15 , 8};
        int maxValue = array5[0];
        for (int i = 1; i < array5.length; i++)
            maxValue = Math.max(array5[i], maxValue);
        // when Math.max will find one number bigger than other one,
        // it'd keep bigger one and keep comparing it with all the rest
        System.out.println(maxValue);

        // 6
        int[] array6 = {12 , 2 , 5 , 15 , 8};
        int minValue = array6[0];
        for (int i = 1; i < array6.length; i++)
            minValue = Math.min(array6[i], minValue);
        System.out.println(minValue);

        // 7
        int[] array7 = {15, 25, 22, 18, 30};

        int max = array7[0];
        int max2 = array7[0];

        for (int i = 1; i < array7.length; i++) {
            if (max < array7[i]) {
                max2 = max;
                max = array7[i];
            }
        }
        System.out.println(max2);

        // 8
        int[] array8 = {5, 6, 3, 12, 14, 19, 8, 9, 22, 31, 40};
        int result8 = 0;

        for (int i = 0; i < array8.length; i++) {
            if (i % 2 == 0) {
                result8 = array8[i] + 6;
            }
            else {
                result8 = array8[i] - 5;
            }
            System.out.println(result8);
        }
    }
}

