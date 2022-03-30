package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _02_ArrayFillInTask {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        System.out.println(Arrays.toString(strArray));

        Arrays.fill(strArray, "*");
        System.out.println(Arrays.toString(strArray));

        String emptyString = ""; // defines string, but it's empty
        String nullString = null; // undefined


    }


}
