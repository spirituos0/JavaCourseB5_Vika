package _01_JAVA.N_Loops._02_WhileLoop;

public class _04_DoWhileLoop {

    public static void main(String[] args) {

//        int counter = 0;
//        while (counter > 1) { // while loop checks condition first, then execute
//            System.out.println("Hello");
//            counter++;
//        }

        int counter2 = 0;
        do { // do - while loop is guaranteed to execute at lease once
            // first execute, second - check the condition
            System.out.println("Hello");
            counter2++;
        } while (counter2 > 1);
    }
}
