package _01_JAVA.R_Methods.R_Methods2;

public class Overview {

    public static void main(String[] args) {

        String str = "Helloo";
        str.length(); //this method returns an integer
        str.charAt(0); // this method accepts index as a parameter and returns a char

        printFive();
        printNumber(10);
        returnNumber(9);

    }

    public static void printFive() {
        System.out.println(5);
    }

    public static void printNumber(int number) { // this method has "int number" as a parameter
        System.out.println(number);
    }
    public static int returnNumber(int number) { // this method takes int number as a parameter
        // and returns number
        return number;
    }
}
