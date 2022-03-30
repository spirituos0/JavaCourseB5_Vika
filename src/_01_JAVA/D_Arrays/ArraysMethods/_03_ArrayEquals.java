package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _03_ArrayEquals {

    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5};
        int[] secondArray = {3, 1, 5};
        int[] thirdArray = {1, 3, 5};

        System.out.println(Arrays.equals(firstArray, secondArray));
        System.out.println(Arrays.equals(firstArray, thirdArray));
        System.out.println(Arrays.equals(secondArray, thirdArray));

    }
}
