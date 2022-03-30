package _01_JAVA.D_Arrays;

import java.util.Arrays; // I need to import, otherwise, it's not gonna work

public class JavaArray {
    // can store collection of data types, multiple elements, values

    public static void main(String[] args) {

        int variable; // how to declare a variable
        // inside of single integer I can store only one variable
        variable = 5; // how to initialize

        // TRADITIONAL WAY:
        int[] myArray = new int[5]; // array can store only 5 elements
        // example: [1, 5, 8, 9, 3] - 5 elements
        myArray[0] = 1;
        myArray[1] = 5;
        myArray[2] = 9;
        myArray[3] = 2;
        myArray[4] = 3;
        // myArray[10] = 0; - we will get an exception
        // if I don't initialize any of the Arrays,
        // it will show result as 0 to still contain 5 elements

        System.out.println(Arrays.toString(myArray));
        // we need to use Array class to print the array

        // EASIER WAY:
        int[] arrayOfNumbers = {100, 1, 1000, 10000, 10};
        // it automatically counts the array size (ex 5) and from this point I cannot change it
        System.out.println("Size of arrayOfNumbers: " + arrayOfNumbers.length);

        // printing according to the way it was given:
        System.out.println(Arrays.toString(arrayOfNumbers));

        // to sort Array:
        Arrays.sort(arrayOfNumbers);
        System.out.println(Arrays.toString(arrayOfNumbers));

        String str = "dji8unr4rgw23thgtyiajke";
        System.out.println(str.length());


        String[] arrayOfCars = {"Mercedes", "BMW", "Tesla", "Toyota", "Ford", "Honda"};
        // square brackets make it an array instead of a string
        System.out.println(Arrays.toString(arrayOfCars));

        Arrays.sort(arrayOfCars); // sorted in alphabetical order
        System.out.println(Arrays.toString(arrayOfCars));

        System.out.println("Length of arrayOfCars: " + arrayOfCars.length);

        System.out.println(arrayOfCars[0]); // 0=BMW, because it sorted array by alphabet





    }
}
