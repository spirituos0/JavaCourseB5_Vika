package _01_JAVA.K_If;

public class _04_IfElseIf {
    public static void main(String[] args) {

        int temp = 25;

        /*
        if (temp >= 30){
            System.out.println("It is hot!");
        }

        if (temp >= 18 && temp < 30) {
            System.out.println("It is a good weather");

        }
        if (temp < 18) {
            System.out.println("it is cold!"); */

        if (temp >= 30) {
            System.out.println("It is a hot day!");
        } else if (temp >= 18 && temp < 30) {
            System.out.println("It is a good weather!");
        } else {
            System.out.println("It is a cold weather!");
        }





    }


}
