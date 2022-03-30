package _01_JAVA.Q_ErrorTypes;

public class _04_DebuggingExample2 {
    public static void main(String[] args) {

        String[] cars = {"BMW", "Toyota", "Mercedes"};

        for (int i = 0; i < 6; i++) { // it will give an exception if there is i > 2
            System.out.println(cars[i]);
        }
    }
}
