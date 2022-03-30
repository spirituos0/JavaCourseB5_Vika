package SatProjects.Week_1;

import java.util.Scanner;

public class _05_GetTotal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three positive numbers " +
                "(space between numbers, start with a symbol or a letter): ");
        String allElements = sc.nextLine();
        String[] elements = allElements.split(" ");

        String num1 = elements[0];  // "$15"
        String num2 = elements[1];  // "$20"
        String num3 = elements[2];  // "$30"

        (num1 + num2 + num3).split("\\D");

        int intNum1 = Integer.parseInt(num1);
        int intNum2 = Integer.parseInt(num2);
        int intNum3 = Integer.parseInt(num3);
        int sum = intNum1 + intNum2 + intNum3;

        System.out.println(sum);
    }
}
/*
        Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
        remove all the non-numeric characters.
        parse the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be ==> 65;

        NOTE : if the output is less than 0 change the output to -1
     */

