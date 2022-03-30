package _01_JAVA.U_CollectionInterface._04_2D_Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class _2D_Collections {

    public static void main(String[] args) {

        // 2D Array
        int[][] twoDArray = new int[1][1];

        // ArrayList which can contain only String ArrayLists
        ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();
//        listOfLists.add("Hey"); --- we cannot do this, because this arraylist only can contain arraylists

            ArrayList<String> cars = new ArrayList<>();
            cars.add("Hyundai");
            cars.add("Toyota");
            cars.add("Ford");

            ArrayList<String> cities = new ArrayList<>();
            cities.add("New York");
            cities.add("London");
            cities.add("Paris");

        listOfLists.add(cars);
        listOfLists.add(cities);

        System.out.println(cars);
        System.out.println(cities);

        // Printing 2D ArrayList
        System.out.println("2D ArrayList that stores ArrayLists: " + listOfLists);

        // Store HashSets inside an ArrayList
        ArrayList<HashSet<Integer>> listOfSets = new ArrayList<>();

           HashSet<Integer> firstSet = new HashSet<>();
           firstSet.add(10);
           firstSet.add(20);

           HashSet<Integer> secondSet = new HashSet<>();
           secondSet.add(10);
           secondSet.add(20);
           secondSet.add(30);
           secondSet.add(40);
           secondSet.add(30);
           // <- this last one doesn't change anything,
        // because Set doesn't contain duplicate values

        listOfSets.add(firstSet);
        listOfSets.add(secondSet);

        System.out.println("2D ArrayList that stores Sets: " + listOfSets);


    }
}
