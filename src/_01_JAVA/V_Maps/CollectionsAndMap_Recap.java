package _01_JAVA.V_Maps;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionsAndMap_Recap {

    public static void main(String[] args) {

        // ArrayList is a dynamic-sized array
        // ArrayList maintains insertion order for elements

//        String[] array = new String[10]; --- fixed size!

        // ***************** Array **************** \\

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("TechnoStudy"); // add element into arrayList
        arrayList.add(0, "Java"); // add element into a specific index
        arrayList.size(); // will return size of the arrayList
        arrayList.indexOf("Java"); // will return index of the object/element
        arrayList.isEmpty(); // will return boolean: if arrayList is empty - true, not empty - false
        arrayList.set(0, "Phyton"); // will update value in arrayList at the certain index
        arrayList.remove(0); // will remove element at index 0
        arrayList.get(0); // will return element at specific index
        arrayList.contains("TechnoStudy"); // will return boolean value

        System.out.println(arrayList); // will print arrayList


        // ***************** Set **************** \\

        // Sets are unordered collections
        // Sets don't allow duplicate values

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
//        hashSet.add(10); - cannot add duplicate values
//        hashSet.add(0, 100) - cannot add element to specific index (no index)
        hashSet.remove(10); // will remove object
        hashSet.isEmpty(); // will return boolean
        hashSet.contains(20); // will return boolean; checks if the hashset contains a specific object
        hashSet.size(); // will return number of elements in set
        hashSet.clear(); // will remove all the elements

        // TreeSet --- stores elements in natural(ascending) order (1, 2, 3...) or (A-Z)
        // HashSet --- unordered Set
        // LinkedHashSet --- stores elements in insertion order


        // ***************** Map **************** \\

        // Maps are key-value paired

        // TreeMap --- using keys' natural order
        // HashMap --- unordered map
        // LinkedHashMap --- using insertion order

    }
}
