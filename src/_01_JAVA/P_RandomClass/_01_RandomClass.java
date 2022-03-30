package _01_JAVA.P_RandomClass;

import java.util.Random;

public class _01_RandomClass {

    public static void main(String[] args) {

        Random random = new Random();

        int randomMath = (int) (Math.random() * 100); // Math class

        int randomNumber = random.nextInt(100);
        int randomNum = random.nextInt(100) + 50; // random num from 50 to 100
        // it's gonna generate random number from 0 to 100
        System.out.println(randomMath);
        System.out.println(randomNumber);

        // Generate a random number between -100 and 100
        int randomNumTask = random.nextInt(200) - 100;
        System.out.println(randomNumTask);
    }
}
