package _01_JAVA.S_OOP._07_Inharitance.Shape;

public class Rectangle extends Shape {

    int length;
    int width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
        super.area = length * width;
        super.perimeter = 2 * (length + width);
    }

    public void angles() {
        System.out.println("This shape has four 90 degrees angles.");
    }
}
