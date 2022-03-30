package _01_JAVA.S_OOP._11_Interfaces._03_CarPack;

public class ToyotaPrius extends Car implements Diesel, Electric {

    public ToyotaPrius(String model, int productionYear) {
        super(model, productionYear);
    }

    @Override
    public void changeOil() {
        System.out.println("Change oil every 3,000 mi");
    }

    @Override
    public void changeBattery() {
        System.out.println("Change battery every 50,000 mi");
    }
}
