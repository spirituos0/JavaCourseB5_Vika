package _01_JAVA.V_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _02_MapTypes {

    public static void main(String[] args) {

        // HashMap --- unordered Map
        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("String1", 100);
        hashMap.put("String2", 200);
        hashMap.put("String3", 300);
        hashMap.put("String4", 400);

        System.out.println(hashMap);

        // TreeMap --- Using Keys' natural order to store data (1, 2, 3) (A-Z)
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Google", 98765432);
        treeMap.put("Apple", 2345678);
        treeMap.put("Microsoft", 25353424);
        treeMap.put("UnitedHealthGroup", 5658729);

        System.out.println("TreeMap: " + treeMap);

        // LinkedHashMap --- Using Insertion order
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Z", 4657);
        linkedHashMap.put("R", 678);
        linkedHashMap.put("A", 23);
        linkedHashMap.put("E", 324);

        System.out.println("LinkedHashMap: " + linkedHashMap);


    }
}
