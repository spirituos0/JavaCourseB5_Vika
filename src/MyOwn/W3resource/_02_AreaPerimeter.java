package MyOwn.W3resource;

public class _02_AreaPerimeter {
    private static final double radius = 7.5;
    public static void main(String[] args) {

        // to find area and perimeter of a circle
        // A = PI * r2 - area
        // C = 2PIr - circumference (perimeter)
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

}
