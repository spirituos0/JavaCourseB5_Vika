package _01_JAVA.S_OOP._04_InstanceModifiers.PublicModifier.Same;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW");

        System.out.println(car.carName);

        car.getCarName();


    }

}
