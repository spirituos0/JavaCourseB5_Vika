package _01_JAVA.W_Exceptions._08_Recap.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class FindException {

    public static void main(String[] args) {
        // 1) where does exception occur
        // 2) catch and handle specific exception
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);

        arrayList.add(3,null);
        // primitive types cannot hold null values, but here we have reference type Integer,
        // which is able to hold null values. So here is NO exception

//        arrayList.get(4); <- exception is HERE, here is no index 4

        // Solution:

        try {
            arrayList.get(4);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Index you provide is not in the range!");
        }

//        Collections.max(arrayList); <- here is another exception,
        // because in our array we have null value, which we cannot compare
        // to get max value.

        // Solution:

        try {
            Collections.max(arrayList);
        } catch (NullPointerException ex) {
            System.out.println("You cannot compare null with Integers!");
        }

        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(0,null);
        System.out.println(arrayList);
    }

}
