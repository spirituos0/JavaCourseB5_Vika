package _01_JAVA.U_CollectionInterface._03_Converting;

import java.util.*;

public class T1_Converting {

    public static void main(String[] args) {

        Integer[] array = new Integer[10];

        Random rnd = new Random();

        for (int i = 0; i < 10; i++)
            array[i] = rnd.nextInt(10);

        System.out.println("Array: " + Arrays.toString(array));

        List<Integer> listConvertedFromArray = new ArrayList<>(Arrays.asList(array));
        System.out.println("List converted from array: " + listConvertedFromArray);

        Set<Integer> integerSet = new HashSet<>(listConvertedFromArray);
        System.out.println("IntegerSet: " + integerSet);

    }
}
