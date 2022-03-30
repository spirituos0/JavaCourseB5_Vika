package _01_JAVA.Homework;

public class ArrayWithLoopAdvance {

    public static void main(String[] args) {

        String dollars = "$12 $23 $10 $2 $5 $2";
        String[] dollarsArray = dollars.split(" "); // converted into an array


        int sum = 0;
        int number = 0;

        for (String dollars1 : dollarsArray) {
            if (dollars1.charAt(0) == '$') {
                number = Integer.parseInt(dollars1.substring(1));
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
