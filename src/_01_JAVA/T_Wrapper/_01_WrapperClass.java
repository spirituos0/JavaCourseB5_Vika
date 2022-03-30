package _01_JAVA.T_Wrapper;

import java.util.Arrays;

public class _01_WrapperClass {

    public static void main(String[] args) {

        // If we want our primitive type to act like non-primitive,
        // we use "Wrapper Classes"

        int a = 5; // primitive types don't have any methods
                   // cannot have null values
                   // starts with lower-case

        Integer b = 5;              // reference types have methods
        String str = "TechnoStudy"; // can have null values
                                    // starts with upper-case

        int[] array1 = new int[3];
        System.out.println(Arrays.toString(array1));
        // always has a value (if it's not assigned, then 0)

        Integer[] array2 = new Integer[3];
        System.out.println(Arrays.toString(array2));
        // can be null

    }
}
