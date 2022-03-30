package _01_JAVA.N_Loops._01_ForLoop;

import java.util.Arrays;

public class _03_ForLoopWithArrays {
    public static void main(String[] args) {

        int[] array = {21, 43, 65, 86, 22, 41, 55, 99};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }
}
