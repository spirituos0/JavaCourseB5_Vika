package _01_JAVA.V_Maps;

import java.util.*;

public class RecapTask3 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> titleWonYears = new HashMap<>();

        ArrayList<Integer> barca = new ArrayList<>(Arrays.asList(1990, 1995, 2003, 2020));
        ArrayList<Integer> real = new ArrayList<>(Arrays.asList(1992, 2008, 2011, 2012, 2014, 2015));
        ArrayList<Integer> juve = new ArrayList<>(Arrays.asList(2005, 2021));

           titleWonYears.put("Barcelona", barca);
           titleWonYears.put("Real Madrid", real);
           titleWonYears.put("Juventus", juve);

        // Find how many titles each team won

        System.out.println(titleWonYears);

        // Solution 1:
        Collection<ArrayList<Integer>> values = titleWonYears.values();
        for (ArrayList<Integer> titles : values) {
            int numberOfTitles = titles.size();
            System.out.println(numberOfTitles);
        }

        // Solution 2: (better)
        Set<String> keys = titleWonYears.keySet();
        for (String key : keys) {
            ArrayList<Integer> years = titleWonYears.get(key); // titleWonYears.get("Barcelona");
            int yearsSize = years.size();
            System.out.println(key + " won " + yearsSize + " titles.");

        }


    }
}
