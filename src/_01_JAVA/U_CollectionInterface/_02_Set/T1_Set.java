package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.HashSet;
import java.util.Set;

public class T1_Set {

    public static void main(String[] args) {

        String[] names = {"Adem", "Matthew", "Lana", "Betul", "Amsal", "Adem", "Lana"};

        Set<String> namesSet = new HashSet<>();

        for (int i = 0; i < names.length; i++)
            namesSet.add(names[i]);

        System.out.println(namesSet);
        // duplicate values are not included

        addAll(namesSet, "Dzuredj", "Feriha", "Arda", "Altyn");
        System.out.println(namesSet);
        // names above were added to an existing list of names in this array
    }

    public static void addAll(Set<String> set, String... elements) {

        for (int i = 0; i < elements.length; i++)
            set.add(elements[i]);

    }


}
