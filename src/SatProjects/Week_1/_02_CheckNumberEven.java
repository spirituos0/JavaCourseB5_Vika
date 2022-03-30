package SatProjects.Week_1;

import java.util.Scanner;
     /*
        Given an int number. Check if the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.
     */


public class _02_CheckNumberEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int userInt = sc.nextInt();
        boolean evenNum = userInt % 2 == 0;

        if (evenNum) { // % 2 == 0  <--- this action helps to check if number is even or odd
            System.out.print("Your number is even: " + evenNum); }
        else {
            System.out.print("Your number is even: " + evenNum); }




    }
}
