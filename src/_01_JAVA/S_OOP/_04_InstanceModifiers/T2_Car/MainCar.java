package _01_JAVA.S_OOP._04_InstanceModifiers.T2_Car;

public class MainCar {

    public static void main(String[] args) {

        Car car1 = new Car(2015); // now we have to initialize year in ()
        car1.name = "BMW";

        System.out.println(car1.name);
        System.out.println(car1.YEAR);

        car1.name = "BMW 520i"; // we updated name of the car, it's not final
        System.out.println(car1.name);

        // car1.YEAR = 2020; <- we cannot do this, because YEAR value is FINAL
    }
}
