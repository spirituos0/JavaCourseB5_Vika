package _01_JAVA.N_Loops._01_ForLoop;

public class T_SumOfNumbers {
    public static void main(String[] args) {

        int sumOfNumbers = 0;

        for (int i = 0; i < 5; i++) {
            sumOfNumbers += i;
            System.out.println("Sum is: " + sumOfNumbers);
        }
    }
}
