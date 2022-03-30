package _01_JAVA.N_Loops._01_ForLoop;

public class _04_NestedLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < 5; j++) {
                System.out.println("   j = " + j);
            }
        }
    }
}
