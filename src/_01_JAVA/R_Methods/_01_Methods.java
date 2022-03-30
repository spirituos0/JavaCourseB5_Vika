package _01_JAVA.R_Methods;

public class _01_Methods {

    public static void main(String[] args) { // we need MAIN method to be able to RUN our code
        printHelloWorld(); // call method
        // now we made our code below get printed
    }

    // to start method we type 'public'
    // 'void' is a return value type.
    // 'void' means it is not gonna return a value, even tho it performs actions
    public/*Access Modifier*/static void printHelloWorld() {
        System.out.println("Hello World"); // this code here is not printing, until we write it in the Main method

    }


}
