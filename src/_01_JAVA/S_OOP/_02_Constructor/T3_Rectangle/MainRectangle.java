package _01_JAVA.S_OOP._02_Constructor.T3_Rectangle;

public class MainRectangle {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5, 12);

        int area = rectangle1.calculateArea();

        System.out.println(area);

    }
}
