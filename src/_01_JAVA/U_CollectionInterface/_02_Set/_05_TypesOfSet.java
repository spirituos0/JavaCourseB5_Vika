package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _05_TypesOfSet {

    public static void main(String[] args) {

        // Hashset --- Unordered collection - Doesn't allow duplicate values
        Set<String> countriesHashSet = new HashSet<>();
        countriesHashSet.add("USA");
        countriesHashSet.add("France");
        countriesHashSet.add("Turkey");
        countriesHashSet.add("China");
        countriesHashSet.add("Germany");
        countriesHashSet.add("Mexico");
        countriesHashSet.add("Mexico"); // cannot store duplicate values

        System.out.println(countriesHashSet);

        // LinkedHashSet --- maintains insertion order - cannot store duplicate values
        Set<String> countriesLinkedHashSet = new LinkedHashSet<>();
        countriesLinkedHashSet.add("USA");
        countriesLinkedHashSet.add("France");
        countriesLinkedHashSet.add("Turkey");
        countriesLinkedHashSet.add("China");
        countriesLinkedHashSet.add("Germany");
        countriesLinkedHashSet.add("Mexico");
        countriesLinkedHashSet.add("Mexico"); // cannot store duplicate values

        System.out.println(countriesLinkedHashSet);


        // TreeSet --- sorted - stores elements in ascending order - cannot store duplicate values
        Set<String> countriesTreeSet = new TreeSet<>();
        countriesTreeSet.add("USA");
        countriesTreeSet.add("France");
        countriesTreeSet.add("Turkey");
        countriesTreeSet.add("China");
        countriesTreeSet.add("Germany");
        countriesTreeSet.add("Mexico");
        countriesTreeSet.add("Mexico");

        System.out.println(countriesTreeSet);


        Set<Integer> numbers = new TreeSet<>();
        numbers.add(4252);
        numbers.add(987);
        numbers.add(876543);
        numbers.add(1);

        System.out.println(numbers);


    }
}
