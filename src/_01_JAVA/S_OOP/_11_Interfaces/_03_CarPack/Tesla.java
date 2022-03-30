package _01_JAVA.S_OOP._11_Interfaces._03_CarPack;

public class Tesla extends Car implements Electric {

    public Tesla(String model, int productionYear) {
        super(model, productionYear);
    }

    @Override
    public void changeBattery() {
        System.out.println("Change Battery every 100,000 mi");
    }
}
