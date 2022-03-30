package _01_JAVA.J_MathClass;

public class MathClassTask {

    public static void main(String[] args) {

        int num1 = (int) (Math.random() * 200);
        System.out.println("Random1 -> " + num1);

        int num2 = (int) (Math.random() * 500);
        System.out.println("Random2 -> " + num2);

        int sum = num1 + num2;
        System.out.println(sum);



        /*
        -30 <--------> 70
        Math.random() * 100(length) - 30 : (-30) is the starting value of the range

        10 <--------> 20
        Math.random() * 10 + 10
        */
        // -50 <--------> 50
        int randomValue = (int) (Math.random() * 100 - 50);

        // -10 <----> 20  :  30 is in between , bigNumber - smallNumber = length
        int randomValue2 = (int) (Math.random() * 30 - 10);






    }
}
