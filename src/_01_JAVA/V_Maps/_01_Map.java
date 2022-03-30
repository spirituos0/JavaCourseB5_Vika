package _01_JAVA.V_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class _01_Map {

    /**
           *  In map data is stored in Key-Value format
           *  Keys cannot be duplicated, values can be duplicated

     */

    public static void main(String[] args) {

        // Map contains employee and salary information
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("John", 100_000);
        salaries.put("John", 135_000); // keys (names) are unique, cannot be duplicated
        salaries.put("Mike", 115_000);
        salaries.put("Rita", 140_000);
        salaries.put("Alex", 140_000); // values can be duplicated
        salaries.put("Emily", 95_000);

        System.out.println("Salaries Map: " + salaries);

        // get() --- can access values by using their keys
        System.out.println("Rita's salary: " + salaries.get("Rita"));

        // keySet() --- method will return all the keys from Map
        Set<String> keys = salaries.keySet();
        System.out.println("Keys of salary Map: " + keys);

        // Printing all elements using their keys
        for (String key : keys)
            System.out.println(" keys of salary map: " + salaries.get(key));

        // values() --- method will return all the values from Map
        Collection<Integer> values = salaries.values();
        System.out.println("Printing all values" + values);

        for (Integer value : values)
            System.out.println("Printing all the values one by one: " + values);

        // size()
        int sizeOfMap = salaries.size();
        System.out.println("Number of entries: " + sizeOfMap);

        // isEmpty()
        boolean isMapEmpty = salaries.isEmpty();
        System.out.println("Map is empty: " + isMapEmpty);

        // putIfAbsent() --- will add a new entry if key doesn't exist
        // if key exists, in that case it won't update the value
        salaries.putIfAbsent("Halit", 75_000);
        System.out.println(salaries);
        salaries.putIfAbsent("Rita", 200_000);
        System.out.println(salaries);

        // containsKey() --- returns boolean - checks if map contains key or not
        boolean ifMapContainsMike = salaries.containsKey("Mike");
        System.out.println("Does map have \"Mike\"? " + ifMapContainsMike);

        // containsValue() --- return boolean - check if map contains value or not
        boolean ifMapContains500k = salaries.containsKey(500_000);
        System.out.println("Does map contain 500kj value? " + ifMapContains500k);

        // clear() --- remove all entries from map
        salaries.clear();
        System.out.println("Salaries map after clear() method: " + salaries);
        isMapEmpty = salaries.isEmpty();
        System.out.println(isMapEmpty);



    }
}
