package MyOwn.W3resource;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RectangleTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble(); // 5.5;

        System.out.print("Enter height: ");
        double height = sc.nextDouble(); // 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        // how I made it:

        System.out.println("Area of the rectangle: " + width + " x " + height + " = " + width * height);

        sc.nextLine(); // to make this and next expression be in the next line, I need to add this extra sc.next()

        System.out.print("Perimeter of the rectangle: " + 2 + " x " +
                "(" + (width) + " + " + height + ")" + " = " + 2 * (width + height));

        // How website suggests:
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);

    }
}
