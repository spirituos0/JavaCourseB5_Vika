package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class T2_Set {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(10);
        arrayList.add(20);

        System.out.println("Elements in ArrayList: " + arrayList);

        Set<Integer> set = new HashSet<>();

        System.out.println("Set before using convert method: " + set);

        // we are getting rid of the duplicate values with the converting
        convertArraylistIntoSet(arrayList, set);

        System.out.println("Set after using convert method: " + set);


        Set<Character> characterSet = new HashSet<>();

        addCharactersToSet(characterSet, 'A', 'F', 'r', 'R', 'Q');

        System.out.println("Character set: " + characterSet);
    }

    public static void convertArraylistIntoSet(ArrayList<Integer> list, Set<Integer> set) {

        for (Integer number : list)
            set.add(number);

    }

    public static void addCharactersToSet(Set<Character> set, Character... chars) {
        for (int i = 0; i < chars.length; i++)
            set.add(chars[i]);
    }
}
