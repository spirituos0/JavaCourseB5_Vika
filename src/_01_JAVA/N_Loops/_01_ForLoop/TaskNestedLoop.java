package _01_JAVA.N_Loops._01_ForLoop;

public class TaskNestedLoop {

    public static void main(String[] args) {

        // part 1
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print('*');
            }
            System.out.println(); // this helps move those **** to the next lane
        }

        // part 2
        for (int i = 0; i < 5; i++) { // 5 *****
            for (int j = 0; j < 6; j++) { // 6 times/rows
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
