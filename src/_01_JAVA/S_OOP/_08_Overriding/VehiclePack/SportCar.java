package _01_JAVA.S_OOP._08_Overriding.VehiclePack;

public class SportCar extends Vehicle {

    public SportCar(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void speedUpTo60() {
        System.out.println("Sport Car is speeding up to 60 mph in 3 seconds!");
    }

    @Override
    public void breakDownFrom60() {
        System.out.println("Sport Car is breaking down from 60 mph to 0 in 4.7 seconds!");
    }
}
