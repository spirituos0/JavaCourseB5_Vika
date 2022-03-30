package _01_JAVA.N_Loops._02_WhileLoop;

public class _02_WhileLoopVsForLoop {

    public static void main(String[] args) {

        // For-Loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        // While-Loop
        int counter = 0; // initialize the counter

        while(counter < 5) { // check the condition. If that's true, then..
            System.out.println("Hello World"); // ..print this..
            counter++; // ..and increase numbers using this.
        }
    }
}
