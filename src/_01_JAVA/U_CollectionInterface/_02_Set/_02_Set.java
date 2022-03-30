package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _02_Set {

    public static void main(String[] args) {

        // Creating Set Object
        Set<Integer> integerSet = new HashSet<>();

        // Adding Elements into Set (cannot store duplicate values)
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(10);
        // if we try to duplicate an object, it's not gonna store the duplicated version anyways

        // Printing Set
        System.out.println(integerSet);

        // set.size() --- returns number of elements in Set
        System.out.println(integerSet.size());

        // set.isEmpty() --- checks if Set is empty or not
        System.out.println(integerSet.isEmpty());

        // set.contains() --- returns boolean
        System.out.println("Does Set contain 10? : " + integerSet.contains(10));

        // set.remove(Object) --- remove a specific object/value
        integerSet.remove(20);
        System.out.println(integerSet);

        // set.clear() --- remove all the elements from Set
        integerSet.clear();
        System.out.println(integerSet);

        // set.get(1) - X - we don't have .get() method for sets, because Sets don't have indexes

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(10);

        System.out.println(integerList);
        // we did the same as with Set above, but the result is different,
        // cuz it allowed us to duplicate the value

    }
}
