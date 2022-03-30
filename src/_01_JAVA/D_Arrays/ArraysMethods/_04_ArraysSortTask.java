package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _04_ArraysSortTask {

    public static void main(String[] args) {

        int[] random = { 542, 64, 901, 3, 7439 };

        System.out.println(Arrays.toString(random));
        Arrays.sort(random);
        System.out.println(Arrays.toString(random));

        System.out.println("Min value in Array: " + random[0]);
        System.out.println("Max value in Array: " + random[random.length-1]);


    }


}
