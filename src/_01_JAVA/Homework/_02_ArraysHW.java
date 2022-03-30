package _01_JAVA.Homework;

import java.util.Arrays;

public class _02_ArraysHW {

    public static void main(String[] args) {

        // 1. Market
        String[] Market = { "Apple", "Orange", "Banana", "Kiwi" };
        System.out.println(Arrays.toString(Market));

        // 2. States
        String[] states = { "New Jersey", "New York", "Massachusetts", "California" };

        System.out.println("Length of the Array: " + states.length);
        System.out.println(Arrays.toString(states));

        // 3. Numbers
        int[] numbers = { 13,15,14,16,16,19,22,22,20,43,8 };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        // 4. Char array
        char[] symbols = { 'a', '4', 'r', 'W', '+', 'M', '1', '!' };
        System.out.println(symbols.length-1); // total: 8 elements. Index of the last: 7

        System.out.println("First char in the array: " + symbols[0]);
        System.out.println("Last char in the array: " + symbols[7]);

        // 5. Sort, equalsTo
        byte[] byteArray1 = { 1, 5, 9 };
        byte[] byteArray2 = { 5, 1, 9 };

        Arrays.sort(byteArray1);
        Arrays.sort(byteArray2);
        System.out.println("Arrays are equal: " + Arrays.equals(byteArray1, byteArray2));

        // 6. Sum
        int[] numbers6 = { 20, 15, 35, 30, 40 };
        System.out.println(numbers6.length); // 5
        int sum = numbers6[0] + numbers6 [1] + numbers6[2] + numbers6[3] + numbers6[4]; // or:
        int sum1 = Arrays.stream(numbers6).sum();
        System.out.println(sum | sum1); // 140

        // 7. FillIn
        String[] word = new String[10];
        Arrays.fill(word, "Hello");
        System.out.println(Arrays.toString(word));

        // 8. Biggest & smallest number
        int[] numbers8 = { 49, 35, 56, 7, 63, 14 };
        Arrays.sort(numbers8);
        System.out.println(Arrays.toString(numbers8)); // [7, 14, 35, 49, 56, 63]
        System.out.println(numbers8.length); // total: 6. Index of the last: [5]
        System.out.println("The smallest number in the array: " + numbers8[0]);
        System.out.println("The biggest number in the array: " + numbers8[5]);














    }
}
