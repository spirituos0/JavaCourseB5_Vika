package _01_JAVA.S_OOP._07_Inharitance.Bicycle;

public class ElectricBike extends Bicycle {

    String batteryType;
    int batteryCapacity;
    int batteryLevel;
    boolean batteryUsage;

    public ElectricBike(int gear, String batteryType, int batteryCapacity) {
        super(gear);
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(int charge) {
        batteryLevel += charge;
    }

}
