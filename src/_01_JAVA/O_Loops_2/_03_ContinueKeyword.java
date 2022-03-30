package _01_JAVA.O_Loops_2;

public class _03_ContinueKeyword {

    public static void main(String[] args) {

        // skip 5
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                continue; // after continue it will move to next iteration

            System.out.println(i); // when i = 5, this part of the code will be skipped
            // in output all the numbers will be printed, except for 5
        }
    }


}
