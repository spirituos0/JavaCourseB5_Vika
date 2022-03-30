package _01_JAVA.R_Methods;

public class _02_MethodsParameters {

    public static void main(String[] args) {

        greetUser("Altyn"); // the value we provide for the method parameter is called argument
        greetUser("Amsal");
        greetUser("Gamze");
    }

    // (String name) -> is parameter in the method signature
    public static void greetUser(String name) {
//        String name; - instead of this action we put it above into ()
        System.out.println("Hello " + name);

    }
}
