package _01_JAVA.C_StringMethods.StringMethodsTasks;

public class Task2Substring {

    public static void main(String[] args) {

        String hello = "Hello Techno Study!";

        String subStudy2 = hello.substring(13); // -> Study!

        hello.substring(13); // -> Study! (but we don't need exclamation mark)

        String subStudy = hello.substring(13, 18);
        System.out.println(subStudy);
        System.out.println(subStudy2);


    }
}

