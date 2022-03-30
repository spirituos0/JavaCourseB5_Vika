package _01_JAVA.S_OOP._01_Introduction.T3_Rectangle;

public class Rectangle {

    public static void main(String[] args) {

    }
    int length;
    int width;

    // perimeter
    public int perimeter() {
        int perimeter = 2 * (length + width);
        return perimeter;
    }

    // area
    public int area() {
        int area = length * width;
        return area;

    }
}
