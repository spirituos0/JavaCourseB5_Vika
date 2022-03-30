package _01_JAVA.S_OOP._07_Inharitance.Shape;

public class ShapeDemo {

    public static void main(String[] args) {

        Circle circle = new Circle(3.5);
        circle.description();
        System.out.println("This shape is called '" + circle.name +
                "' and its radius is " + circle.radius + " cm");
        circle.noAngles();
        System.out.println("Perimeter of the circle is: " + circle.perimeter + " cm");
        System.out.println("Area of the circle is: " + circle.area + " cm");
        System.out.println();

        Rectangle rectangle = new Rectangle(7, 9);
        rectangle.description();
        System.out.println("This shape is called '" + rectangle.name +
                "' and its length = " + rectangle.length + " cm, width = " + rectangle.width + " cm");
        System.out.println("Perimeter of the rectangle is: " + rectangle.perimeter + " cm");
        System.out.println("Area of the rectangle is: " + rectangle.area + " cm");
        rectangle.angles();
        System.out.println();

        Square square = new Square(5);
        square.description();
        System.out.println("This shape is called '" + square.name);
        System.out.println("Perimeter of the square is: " + square.perimeter + " cm");
        System.out.println("Area of the square is: " + square.area + " cm");
        square.angles();
        square.sides();
    }
}
