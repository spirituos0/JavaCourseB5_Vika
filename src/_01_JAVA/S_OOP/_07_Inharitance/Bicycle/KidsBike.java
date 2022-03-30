package _01_JAVA.S_OOP._07_Inharitance.Bicycle;

public class KidsBike extends Bicycle {

    int numberOfWheels;

    public KidsBike(int gear, int numberOfWheels) {
        super(gear);
        this.numberOfWheels = numberOfWheels;
    }

}
