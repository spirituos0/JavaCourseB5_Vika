package _01_JAVA.U_CollectionInterface._02_Set;

import java.util.HashSet;
import java.util.Set;

public class _03_PrintElementsOfSet {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();

        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Tesla");

        System.out.println(cars);

        // to print all the elements on new line each, we can use for each loop,
        // because in for each loop we don't deal with indexes;
        // for loop would require indexes, which Set doesn't have
        for (String car : cars)
            System.out.println(car);

        // to print a specific element in Set:
        for (String car : cars)
            if (car.equals("Toyota"))
                System.out.println(car);
            // but not really reacommended


    }

}
