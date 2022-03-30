package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.HashSet;
import java.util.Set;

public class _04_AddedOrNot {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(3);
        integerSet.add(9876);
        integerSet.add(35);
        integerSet.add(0);
        integerSet.add(123445);

        boolean isAdded = integerSet.add(35); // if it CANNOT ADD the element, it will return false
        boolean isAdded2 = integerSet.add(5); // if it CAN ADD, it will return true

        System.out.println(integerSet);
        System.out.println(isAdded);
        System.out.println(isAdded2);

    }
}
