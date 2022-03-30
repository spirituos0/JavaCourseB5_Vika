package SatProjects.Week_3;

public class ThreeEvenOdd {

    public static void main(String[] args) {


    }

    public static boolean threeEvenOrOdd(int[] intArray) {

        boolean contains3EvenOrOdd = false;
        int evenNums = 0;
        int oddNums = 0;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 == 0) {
                evenNums = intArray[i];
            } else {
                oddNums = intArray[i];
            }
        }
        if (evenNums == 3 || oddNums == 3) {
            contains3EvenOrOdd = true;
        }
        return contains3EvenOrOdd;
    }
}
