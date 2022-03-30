package _01_JAVA.V_Maps;

import java.util.*;

public class RecapTask2 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> groupsAndMembers = new HashMap<>();

        ArrayList<String> devTeam = new ArrayList<>(Arrays.asList("Isriz", "Amsal", "Lana", "Aina"));
        ArrayList<String> qaTeam = new ArrayList<>(Arrays.asList("Shuang", "Yusuf", "Feriha"));

        groupsAndMembers.put("DevelopmentTeam", devTeam);
        groupsAndMembers.put("QaTeam", qaTeam);

        System.out.println(groupsAndMembers);

        // Part 2
        // Solution 1
        Collection<ArrayList<String>> values = groupsAndMembers.values();
        // each value is a list
        // I need to find size of each value/list
        for (ArrayList<String> element : values) {
            int numberOfMembers = element.size();
            System.out.println(numberOfMembers);
        }

        // Solution 2
        ArrayList<String> value1 = groupsAndMembers.get("DevelopmentTeam"); // ArrayList
        Set<String> keys = groupsAndMembers.keySet();
        for (String key : keys) {
            ArrayList<String> memberList = groupsAndMembers.get(key);
            System.out.println("Number of members in group " + key + ": " + memberList.size());
        }

    }
}
