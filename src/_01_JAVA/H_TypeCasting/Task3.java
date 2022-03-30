package _01_JAVA.H_TypeCasting;

public class Task3 {
    public static void main(String[] args) {

        int student1 = 80;
        int student2 = 95;
        int student3 = 33;
        int student4 = 71;

        // find the actual average for this students

        int sum = student1 + student2 + student3 + student4; // 279
        double average = (double) sum / 4;
        System.out.println(average);



    }

}
