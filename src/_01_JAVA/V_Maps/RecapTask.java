package _01_JAVA.V_Maps;

import java.util.HashMap;

public class RecapTask {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        hashMap.put("Five", 5);

        // Solution 1:
        hashMap.putIfAbsent("Six", 6);
        System.out.println(hashMap);

        // Solution 2:
        boolean containsKeySix = hashMap.containsKey("Six");
        if (!containsKeySix) {
            hashMap.put("Six", 6);
        }

        // Solution 3 (not recommended):
        Integer value = hashMap.get("Six");
        if (value == null) {
            hashMap.put("Six", 6);
        }

        // *************** Part 2 ******************

        // Solution 1
        if (hashMap.containsKey("Three")) {
            hashMap.put("Three", 33); // update value for key "Three"
        }

        // Solution 2
        Integer value2 = hashMap.get("Three");
        if (value2 != null) {
            hashMap.put("Three", 33);
        }

    }
}
