package _01_JAVA.K_If;

public class _02_IfStatementWithComparisonOperators {
    public static void main(String[] args) {

        int numberOfStudents = 32;

        if (numberOfStudents > 20) { // true. this appears in the output
            System.out.println("There are more than 20 students in the class!");
        }
        if (numberOfStudents > 10) { // true. gets executed
            System.out.println("There are more than 10 students in the class!");
        }
        if (numberOfStudents < 10) { // false
            System.out.println("There are less than 10 students in the class!");
        }
        if (numberOfStudents == 10) { // false
            System.out.println("There are 10 students in the class!");
        }


    }
}
