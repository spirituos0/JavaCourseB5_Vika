package _01_JAVA.S_OOP._07_Inharitance.Shape;

public class Circle extends Shape {

    double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        // we do it super(name), because we don't have to give every
        // circle object any certain name.
        // All circle objects will be just circles
        this.radius = radius;
        super.area = PI * radius * radius;
        super.perimeter = 2 * PI * radius;
    }
    public void noAngles() {
        System.out.println("Circle has no angles");
    }


}
