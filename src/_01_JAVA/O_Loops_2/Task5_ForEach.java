package _01_JAVA.O_Loops_2;

public class Task5_ForEach {

    public static void main(String[] args) {

        // print array with for each loop
        // print length of each element

        String[] list = {"fruits", "vegetables", "meat", "milk"};

        for (String food : list) {
            System.out.println(food);
            System.out.println(food.length());
        }

        for (String food : list) {
            if (food.startsWith("v")) // if string starts with v, break the loop.
                break;
            System.out.println(food); // otherwise, print strings

        }
    }
}
