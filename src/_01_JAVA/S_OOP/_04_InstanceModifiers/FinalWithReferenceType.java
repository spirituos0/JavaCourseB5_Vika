package _01_JAVA.S_OOP._04_InstanceModifiers;

import java.util.Arrays;

public class FinalWithReferenceType {

    public static void main(String[] args) {

        // when we declare the array as final, the size of array is final and cannot be changed.
        final String[] MONTHS = {"January", "February", "March", "April", "May",
                "June", "July", "August", "September", "November", "December"};

        System.out.println(Arrays.toString(MONTHS));

        MONTHS[3] = "Hi";
        // we can change value inside the array, but we cannot change the size of array
        // it just changed index of [3], which was March
        System.out.println(Arrays.toString(MONTHS));

//        MONTHS = new String[6];
        // we cannot update the array itself, only separate values

//        final String[] array = new String[10];
//        array = new String[20];
        // we cannot do this as well, cut final size is 10, we cannot update it to 20

    }
}
