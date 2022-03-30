package _01_JAVA.Homework;

public class test {

    public static void main(String[] args) {

        // 8
        int[] array8 = {5 , 6 , 3 , 12 , 14 , 19, 8, 9, 22, 31, 40};
        int result8 = 0;

        for (int i = 0; i < array8.length; i++) {
            if (i % 2 == 0) {
                result8 = array8[i] + 6;
            }
            else {
                result8 = array8[i] - 5;
            }
            System.out.println(result8);
        }

    }
}