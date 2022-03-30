package _01_JAVA.N_Loops._01_ForLoop;

public class _01_ForLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { // starts from 0 and ends at index 4
            System.out.println("Hello World! " + i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World! " + i); // from index 1 to 5
        }

        // reverse:
        for (int i = 5; i > 0; i--) {
            System.out.println("Reverse");
        }
    }
}
