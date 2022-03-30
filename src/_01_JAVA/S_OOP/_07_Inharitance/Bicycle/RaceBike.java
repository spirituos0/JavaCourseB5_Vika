package _01_JAVA.S_OOP._07_Inharitance.Bicycle;

public class RaceBike extends Bicycle {

    int wheelSize;

    public RaceBike(int gear, int wheelSize) {
        super(gear);
        this.wheelSize = wheelSize;
    }

}
