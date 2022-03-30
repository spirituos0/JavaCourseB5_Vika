package _01_JAVA.S_OOP._11_Interfaces._03_CarPack;

public class Car {

    private String model;
    private int productionYear;

    public Car(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
