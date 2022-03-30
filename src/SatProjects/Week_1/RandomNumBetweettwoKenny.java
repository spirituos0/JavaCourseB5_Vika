package SatProjects.Week_1;

import java.util.Scanner;

public class RandomNumBetweettwoKenny {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] elements = s1.split(" ");
        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        // Please don't change anything before this line. Start your code after this line.

        //if min greater than max,swap the value
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }

        //Math.random() ,make a random number ranged from 0 to 1,does not include 1
        //max-min ,the size of the range between max and min
        //+1 ,the range we need can include the value of max
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("a random number between " + min + " and " + max + " is " + randomNumber);

    }
}

