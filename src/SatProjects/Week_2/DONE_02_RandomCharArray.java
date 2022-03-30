package SatProjects.Week_2;

import java.util.Arrays;
import java.util.Random;

public class DONE_02_RandomCharArray {
      /*
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.
        Note: There is no test case provided for this assignment in the Tests class. You can test it by yourself.
     */

    public static void main(String[] args) {

        Random rd = new Random();
        final byte ENGLISH_LETTERS = 26;
        final byte UPPERCASE_ALPHABET = 65;
//      this is ASCII table , where each letter has its own number. 'A' capital is 65
//      lower cased would be 97

        int rdLength = rd.nextInt(22) + 2;
        // we create an int that contains a random number between 2 and 22 as a length for char

        char[] myArr = new char[rdLength]; // now we give that random length to the char
        System.out.println("Random length between 2 and 22: " + myArr.length);

        char randomChar;
        for (int i = 0; i < myArr.length; i++) {
            randomChar = (char) (rd.nextInt(ENGLISH_LETTERS) + UPPERCASE_ALPHABET);
            myArr[i] = randomChar;
        }
        System.out.println("Array of " + rdLength + " random capital letters: " + Arrays.toString(myArr));
    }
}
