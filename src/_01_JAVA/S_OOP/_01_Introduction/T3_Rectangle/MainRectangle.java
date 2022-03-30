package _01_JAVA.S_OOP._01_Introduction.T3_Rectangle;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 10;
        rectangle1.width = 9;

        int perimeter1 = rectangle1.perimeter();
        int area1 = rectangle1.area();

        System.out.println("Perimeter for rectangle1: " + perimeter1);
        System.out.println("Area for rectangle1: " + area1);
    }
}
