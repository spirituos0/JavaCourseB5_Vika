package _01_JAVA.D_Arrays.ArraysTasks;

import java.util.Arrays;

public class Task3ArrToStrDoubles {

    public static void main(String[] args) {

        double[] arrayOfDoubles = {1.4, 0.78, 3.98, 0.01};
        System.out.println(Arrays.toString(arrayOfDoubles));

        Arrays.sort(arrayOfDoubles);
        System.out.println(Arrays.toString(arrayOfDoubles));


    }
}
