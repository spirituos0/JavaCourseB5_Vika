package _01_JAVA.S_OOP._07_Inharitance.Bicycle;

public class Bicycle {

    int gear;
    int speed = 0;

    public Bicycle(int gear) {
        this.gear = gear;
    }

    public void speedUp(int incrementSpeed) {
        // we did it void, because we don't need any return type in here
        speed += incrementSpeed;
    }

    public void applyBreak(int decrementSpeed) {
        if (decrementSpeed > speed)
            speed = 0;
        speed -= decrementSpeed;
    }
}
