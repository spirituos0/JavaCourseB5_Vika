package _01_JAVA.W_Exceptions.Types;

public class UncheckedException {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(intArray[5]);
        System.out.println(intArray[0]);

        // Unchecked Exception appears at Runtime
//        System.out.println(intArray[20]); // no compiler error, there is no index [20]

        // that's how we handle this exception:
        try {
            System.out.println(intArray[20]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There is no such index!");
        }

        // now we have no exception, because we have index [8],
        // so this part will be ignored:
        try {
            System.out.println(intArray[8]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("There is no such index!");
        }
    }
}
