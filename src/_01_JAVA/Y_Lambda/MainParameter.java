package _01_JAVA.Y_Lambda;

public class MainParameter {

    public static void main(String[] args) {

        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }

    public static void printFormatted(String str, StringFunction format) {

        String result = format.run(str);
        System.out.println(result);
    }
}
