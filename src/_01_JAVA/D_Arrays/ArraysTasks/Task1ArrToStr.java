package _01_JAVA.D_Arrays.ArraysTasks;

import java.util.Arrays;

public class Task1ArrToStr {

    public static void main(String[] args) {

        byte[] myArray = new byte[3];
        myArray[0] = 4;
        myArray[1] = 1;
        myArray[2] = -8;

        System.out.println(Arrays.toString(myArray));
    }
}
