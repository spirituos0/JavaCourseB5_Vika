package _01_JAVA.R_Methods.R_Methods3;

public class T3_Varargs_HW {
    /*
    -PART 1-
    // Create a method that calculates average of a student in a class
    // inputs: Name, Class Name, multiple Results(multiple integers)
    // ex: Layla, Java, 80, 100, 90
    // return: Name + ClassName + Average
    // ex output: Layla, Java, 90-> (avr)

-PART 2-
     Overload calculateAverage method with only changing
     Multiple integers to multiple doubles for "Results parameter"
     */
    public static void main(String[] args) {

        String result = calculateAverage("Betul", "Java", 100, 95, 100, 90, 94);
        System.out.println(result);

        String result2 = calculateAverage("Dzanan", "Java", 99.3, 91.45, 97.98);
        System.out.println(result2);
    }

    public static String calculateAverage(String name, String className, int...grades) {
        // varargs should be always in the end in parameters
        // we can only have ONE vararg as a parameter

        int numberOfGrades = grades.length;
        int sum = 0;
        for (int i = 0; i < grades.length; i++)
            sum += grades[i];

        double average = (double) sum / numberOfGrades;

        return (name + " " + className + " " + average);

    }

    public static String calculateAverage(String name, String className, double... grades) {

        int numberOfGrades = grades.length;
        double sum = 0;
        for (int i = 0; i < grades.length; i++)
            sum += grades[i];

        double average = sum / numberOfGrades;

        return (name + " " + className + " " + average);
    }
}
