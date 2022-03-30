package MyOwn.W3resource;

import java.util.Scanner;

public class _01_ScannerMath {
    public static void main(String[] args) {

        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));

        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));

        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));

        System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

        System.out.println(num1 + "mod" + num2 + "=" + (num1 % num2));
    }
}

/*
nextBoolean()	Reads a boolean value from the user
nextByte()	    Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	    Reads a float value from the user
nextInt()	    Reads an int value from the user
nextLine()	    Reads a String value from the user
nextLong()	    Reads a long value from the user
nextShort()	    Reads a short value from the user */