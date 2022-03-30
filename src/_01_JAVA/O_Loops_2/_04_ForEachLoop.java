package _01_JAVA.O_Loops_2;

public class _04_ForEachLoop {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Mercedes", "Tesla", "Toyota", "Honda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (String car : cars) { // get every item from the array.
            // index and length is handled by Java
            System.out.println(car);

            // Cons:
            // We don't know the index
            // We cannot print in reverse
        }

    }
}
