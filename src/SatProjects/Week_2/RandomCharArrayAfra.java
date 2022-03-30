package SatProjects.Week_2;

import java.util.Arrays;
import java.util.Random;

public class RandomCharArrayAfra {
    public static void main(String[] args) {

        Random random = new Random();
        System.out.println();

        int randomNumber = random.nextInt(22) + 2;
        char[] arrayOfChar = new char[randomNumber];

        char randomChar;
        for (int i = 0; i < arrayOfChar.length; i++) {
            randomChar = (char) (random.nextInt(26) + 65);
            arrayOfChar[i] = randomChar;
        }
        System.out.println("Array of " + randomNumber + " random capital letters: " + Arrays.toString(arrayOfChar));
    }
}

