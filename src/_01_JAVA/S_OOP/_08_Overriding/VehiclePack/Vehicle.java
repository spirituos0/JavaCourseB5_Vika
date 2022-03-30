package _01_JAVA.S_OOP._08_Overriding.VehiclePack;

public class Vehicle {

    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void speedUpTo60() {}
    public void breakDownFrom60() {}

}
