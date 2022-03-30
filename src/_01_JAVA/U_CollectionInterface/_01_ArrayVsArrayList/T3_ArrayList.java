package _01_JAVA.U_CollectionInterface._01_ArrayVsArrayList;

// PART 1:
     // create a method that will create an arrayList of integers
     // with 5 random numbers (1 to 10) and return created ArrayList

// PART 2:
     // create a method that updates the middle element to the element that is provided in parameter
     // [3, 4, 1, 6, 9] -> provided parameter 100 -> [3, 4, 100, 6, 9]

import java.util.ArrayList;
import java.util.Random;

public class T3_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> newArrayList = createRandomArrayList();
        System.out.println(newArrayList);

        updateMiddleElement(newArrayList, 1000);
        System.out.println(newArrayList);
    }

    public static ArrayList<Integer> createRandomArrayList() {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++)
            arrayList.add(random.nextInt(10) + 1);

        return arrayList;
    }

    public static void updateMiddleElement(ArrayList<Integer> list, Integer newValue) {
        int middleIndex = list.size() / 2;
        list.set(middleIndex, newValue);
    }
}
