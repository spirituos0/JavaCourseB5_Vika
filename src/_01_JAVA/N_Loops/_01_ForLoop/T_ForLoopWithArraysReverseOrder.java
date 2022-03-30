package _01_JAVA.N_Loops._01_ForLoop;

import java.util.Arrays;

public class T_ForLoopWithArraysReverseOrder { // in reverse order
    public static void main(String[] args) {

        String[] array = {"apple", "watermelon", "peach", "strawberry", "kiwi"};

        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

}
