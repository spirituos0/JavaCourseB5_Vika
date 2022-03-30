package _01_JAVA.S_OOP._04_InstanceModifiers.T2_Car;

public class Car {

    public String name;
    public final int YEAR; // if we cave final int, we need to initialize it in the constructor (below)

    public Car(int year) {
        this.YEAR = year;
    }
}
