package _01_JAVA.S_OOP._01_Introduction.T4_Circle;

public class MainCircle {

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        circle1.radius = 5;

        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());

        Circle circle2 = new Circle();
        circle2.radius = 100;

        System.out.println(circle2.area());
        System.out.println(circle2.perimeter());


    }



}
