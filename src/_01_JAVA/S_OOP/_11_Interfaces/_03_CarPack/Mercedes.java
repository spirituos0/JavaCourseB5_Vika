package _01_JAVA.S_OOP._11_Interfaces._03_CarPack;

public class Mercedes extends Car implements Diesel {

    public Mercedes(String model, int productionYear) {
        super(model, productionYear);
    }

    @Override
    public void changeOil() {
        System.out.println("Change Oil every 5,000 mi");
    }

}
