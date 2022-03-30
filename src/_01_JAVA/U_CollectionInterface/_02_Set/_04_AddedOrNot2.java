package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class _04_AddedOrNot2 {

    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            int randomNumber = rnd.nextInt(6);
            boolean isAdded = integerSet.add(randomNumber);
            if (!isAdded)
                System.out.println(randomNumber);
        }

        System.out.println(integerSet);

    }
}
