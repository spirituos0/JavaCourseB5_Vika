package _01_JAVA.N_Loops._01_ForLoop;

public class T_NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
