package _01_JAVA.U_CollectionInterface._01_ArrayVsArrayList;

import java.util.ArrayList;

public class T1_Arraylist {

    // create an arrayList of Strings
    // add - "Red", "Green", Blue", "Yellow" and "Black" inside
    // print out all the elements, each element on new line
    // Create a method that accepts a string arraylist and a string as parameters
    // method should add the element at the first index of arraylist


    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        addElementAtIndex0(colors, "White");
        System.out.println(colors);

        addElementBeforeLastIndex(colors, "Pink");
        System.out.println(colors);
    }

    private static void addElementAtIndex0(ArrayList<String> list, String element) {
        list.add(0, element);
    }

    private static void addElementBeforeLastIndex(ArrayList<String> list, String element) {
        list.add(list.size() - 1, element);
    }

}
