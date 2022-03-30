package _01_JAVA.V_Maps;

import java.util.HashMap;
import java.util.Set;

public class _01_Task1 {

    public static void main(String[] args) {

        HashMap<Integer, String> zipAndCity = new HashMap<>();
        zipAndCity.put(7010, "Cliffside park");
        zipAndCity.put(8536, "Plainsboro");
        zipAndCity.put(1234, "Brooklyn");

        Set<Integer> keys = zipAndCity.keySet();

        for (Integer key : keys)
            System.out.println(key + " => " + zipAndCity.get(key));

        System.out.println(keys);

    }
}
