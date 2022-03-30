package _01_JAVA.S_OOP._01_Introduction.T4_Circle;

public class Circle {

    final double PI = 3.14;
    double radius;

    public double area() {
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    public double perimeter() {
        double perimeter = 2 * PI * radius;
        return perimeter;

    }
}
