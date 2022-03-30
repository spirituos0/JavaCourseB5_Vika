package SatProjects.Week_1;

import java.util.Scanner;

public class _04_FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your integer: ");
        int userInt = sc.nextInt();

        if ((userInt % 5 == 0) && (userInt % 3 == 0)) {
            System.out.print("fizzbuzz");
        }
        else if (userInt % 5 == 0) {
            System.out.print("fizz");
        }
        else if (userInt % 3 == 0) {
            System.out.print("buzz");
        } else {
            System.out.print("Same Number: " + userInt);
        }
    }
}





/*
        Given an int number
            -print "fizz" when given number is divisible by 5
            -print "buzz" when given number is divisible by 3
            -print "fizzbuzz" when given number is divisible by both 3 and 5
            -print same number if it is not divisible by 3 or 5

        Examples:
            input1 -> 10 | output1 -> fizz
            input2 -> 9  | output2 -> buzz
            input3 -> 30 | output3 -> fizzbuzz
            input4 -> 7  | output4 -> 7
     */