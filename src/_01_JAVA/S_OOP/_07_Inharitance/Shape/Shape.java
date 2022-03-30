package _01_JAVA.S_OOP._07_Inharitance.Shape;

public class Shape {

    String name;
    double area;
    double perimeter;

    public Shape(String name) {
        this.name = name;
    }

    public void description() {
        System.out.println("This is two-dimensional shape");
    }
}
