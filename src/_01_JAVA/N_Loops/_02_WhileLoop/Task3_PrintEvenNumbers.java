package _01_JAVA.N_Loops._02_WhileLoop;

public class Task3_PrintEvenNumbers {

    public static void main(String[] args) {

        // for loop
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
        }

        // while loop. Same thing
        int counter = 0;
        while (counter <= 50) {
            System.out.println(counter);
            counter += 2;
        }
    }
}
