package SatProjects.Week_1;

import java.util.Arrays;
import java.util.Scanner;

public class _07_RandomNumBetweenTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two positive numbers: ");
        String s1 = scanner.nextLine();
        String[] elements = s1.split(" ");
        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        // if we don't know if given first number is smaller than the second one:

        // First option - sort:
        Arrays.sort(elements);

        // second option - swap:
        if (min > max) {
            int temp = min;
            min = max;
            max = temp; }

        int randomNum = (int) (Math.random() * (max+min) - min);
        System.out.print(randomNum);



    }
}
/*
    Given two positive integer numbers
    i.e.  "15 20"  or "7 235"

     integer 1 is min
     integer 2 is max

    create a random number between min and max (inclusive)

    output should be int

    Challenge: what if we do not know that the first number is smaller than the second.
     */