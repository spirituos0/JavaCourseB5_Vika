package _01_JAVA.S_OOP._02_Constructor.T3_Rectangle;

public class Rectangle {

    int length;
    int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int calculateArea() {
        return length * width;
    }
}
