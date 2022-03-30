package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class T3_AddedOrNot {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(1);
        listOfNumbers.add(3);
        listOfNumbers.add(1);
        listOfNumbers.add(2);
        listOfNumbers.add(4);
        listOfNumbers.add(5);
        listOfNumbers.add(5);

        int duplicateCount = 0;

        Set<Integer> uniqueNumbers = new HashSet<>();
        List<Integer> duplicatedValues = new ArrayList<>();

        for (int i = 0; i < listOfNumbers.size(); i++) {
            boolean isAdded = uniqueNumbers.add(listOfNumbers.get(i));
            if (!isAdded) {
                duplicateCount++;
                duplicatedValues.add(listOfNumbers.get(i));
            }
        }
        System.out.println("Number of duplicated values: " + duplicateCount);
        System.out.println("Duplicated values: " + duplicatedValues);

    }
}
