package _01_JAVA.D_Arrays.ArraysMethods;

import java.util.Arrays;

public class _05_ArraysBinarySearchTask {

    public static void main(String[] args) {

        String[] fruits = { "pineapple", "lemon", "kiwi", "banana", "strawberry" };

        Arrays.sort(fruits);

        int indexOfFavoriteFruit = Arrays.binarySearch(fruits, "kiwi");

        System.out.println("index: " + indexOfFavoriteFruit + "\n" +
                "favorite fruit: " + fruits[indexOfFavoriteFruit]);



    }
}
