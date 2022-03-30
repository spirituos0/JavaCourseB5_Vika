package _01_JAVA.N_Loops._01_ForLoop;

import java.util.Arrays;

public class T_InitArrayWithForLoop {

    public static void main(String[] args) {

        byte[] byteArray = new byte[3];

        byteArray[0] = (byte) (Math.random() * 127);
        byteArray[1] = (byte) (Math.random() * 127);
        byteArray[2] = (byte) (Math.random() * 127);

        System.out.println(Arrays.toString(byteArray));

        // initializing array with random values:
        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) (Math.random() * 127);
        }

        // print array:
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
    }
}
