package SatProjects.Week_1;

import java.util.Scanner;
/*
    Given a positive integer number whose name is max,

    create a random number between 0 to max (inclusive)

    output should be int

    [0, userMax]
    user can put any positive int number, that would work as a max.
    it has to be no bigger than Actual Max of int (2M).
     */
public class _06_RandomNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter positive integer number: ");
        int userMax = sc.nextInt();

        int randomNum = (int) (Math.random() * (userMax+1));
        // in the range from 0 to the any max number, that user provided
        /* since we ask for INTEGER, it automatically means that user
         should not put bigger number than actual maximum of the integer number (~2M) */

        System.out.println("Random number value from 0 and your number is: " + randomNum);

        }
}
