package _01_JAVA.W_Exceptions._07_CustomException;

public class Demo {

    public static void main(String[] args) {

        int[] arr = {10, 11, 12, 13, 14, 15};

        printArrayElement(arr, 20);
    }

    public static void printArrayElement(int[] array, int elementIndex) {
        if (elementIndex >= array.length) {
            throw new YouAreWrongBro();
        }
        System.out.println(array[elementIndex]);
    }

}
