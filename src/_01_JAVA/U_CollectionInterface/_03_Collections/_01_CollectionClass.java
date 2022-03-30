package _01_JAVA.U_CollectionInterface._03_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class _01_CollectionClass {

    public static void main(String[] args) {

        ArrayList<Integer> arraylist = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            int randomNumber = rnd.nextInt(10);
            arraylist.add(randomNumber);
            hashSet.add(randomNumber);
        }

        System.out.println("ArrayList when it's created: " + arraylist);
        System.out.println("HashSet when it's created: " + hashSet); // not allow duplicate values

        Integer[] numbers = {99, 55, 22, 44};

        // addAll() --- to add multiple elements to List or Set
        Collections.addAll(arraylist, numbers);
        System.out.println("ArrayList after adding multiple elements: " + arraylist);

        // sort() --- to sort list in ascending order (natural)
        Collections.sort(arraylist);
        System.out.println("ArrayLis after sort method: " + arraylist);

        // reverseOrder() --- sorts elements in descending order (reverse)
        Collections.sort(arraylist, Collections.reverseOrder());
        System.out.println("ArrayList after sorting in reverse order: " + arraylist);

        // shuffle() --- shuffles list randomly
        Collections.shuffle(arraylist);
        System.out.println("ArrayList after shuffle method: "+ arraylist);

        // rotate() --- will move all elements with distance we provide
        Collections.rotate(arraylist, 2);
        // if the number was negative (-2 for ex., then it will rotate numbers backwards)
        // positive moves forward
        System.out.println("ArrayList after rotate method: " + arraylist);

        // replaceAll() --- all the values we provide will be replaced with the new value
        Collections.replaceAll(arraylist, 22, 9999999);
        // it replaces all '22' with '9999999'
        System.out.println("ArrayList after replaceAll method: " + arraylist);

        // max() --- to find the biggest number in Collection
        Integer maxValue = Collections.max(arraylist);
        System.out.println("Max value for arrayList: " + maxValue);

        // min() --- to find smallest number in Collection
        Integer minValue = Collections.min(arraylist);
        System.out.println("Min value for the ArrayList: " + minValue);

        // max() and min() methods can be used for Set too!
        Integer maxValueForSet = Collections.max(hashSet);
        System.out.println("Max value for HashSet: " + maxValueForSet);

        Integer minValueForSet = Collections.min(hashSet);
        System.out.println("Min value for HashSet: " + minValueForSet);

        // binarySearch() --- we need to sort List first before using binarySearch
        Collections.sort(arraylist);
        int indexOf44 = Collections.binarySearch(arraylist, 44);
        // here we are looking of index of 44
        System.out.println(indexOf44);

    }
}
