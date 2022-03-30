package _01_JAVA.S_OOP._10_Abstract._04_VehiclePack;

public abstract class Vehicle {

    /**
     *  - Abstract methods can be OVERLOADED
     *  - abstract int year; | not possible - cannot use abstract keyword for variables
     */

    int year;
    int horsePower;

    public Vehicle(int year, int horsePower) {
        this.year = year;
        this.horsePower = horsePower;
    }
    public int getYear() {
        return year;
    }
    public int getHorsePower() {
        return horsePower;
    }

    public abstract void move(int meters);

    public abstract void move(int units, String unit);

    public abstract void fuelUp(int liters);

}
