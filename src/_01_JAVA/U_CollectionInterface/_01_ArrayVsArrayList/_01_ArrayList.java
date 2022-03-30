package _01_JAVA.U_CollectionInterface._01_ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_ArrayList {

    public static void main(String[] args) {

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        System.out.println(Arrays.toString(array));

        // create an ArrayList
        // we use reference types inside <> : if int => Integer
        ArrayList<Integer> arrayList = new ArrayList<>(); // create an ArrayList
        // we can use Strings too

        // list.add() --- adding elements into arrayList
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);



        // list.get(index) === getting element at a specific index
        Integer elementAtIndex2 = arrayList.get(2); // = array[0];
        System.out.println(elementAtIndex2);

        arrayList.add(0,1); // we add an element to a specific index
        System.out.println(arrayList);

        // Printing as ArrayList
        System.out.println(arrayList);

        // Remove an element from a specific index
        arrayList.remove(0);
        System.out.println(arrayList);

        // Remove a specific element from ArrayList
        // (will remove first occurrence of an element)
        Integer elementToRemove = 40;
        arrayList.remove(elementToRemove);
        System.out.println(arrayList);

        // list.set(index, newValue) --- updating element in a specific index
        arrayList.set(2, 1000);
        System.out.println(arrayList);

        // list.size() --- returns number of elements in the arrayList
        int sizeOfArrayList = arrayList.size();
        System.out.println(sizeOfArrayList);

        // list.clear() --- removes all elements in arrayList
        arrayList.clear();
        System.out.println(arrayList); // empty []

        // list.isEmpty() --- returns boolean
        // checks if the arrayList is empty or not
        boolean isEmpty = arrayList.isEmpty();
        System.out.println(isEmpty);

        // Print arrayList using loop
        ArrayList<Double> newArrayList = new ArrayList<>();
        newArrayList.add(5.87);
        newArrayList.add(91.7);
        newArrayList.add(4.86);
        newArrayList.add(754.4);

        for (int i = 0; i < newArrayList.size(); i++)
            System.out.println(newArrayList.get(i));

    }
}
