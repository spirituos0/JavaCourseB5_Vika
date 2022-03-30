package _01_JAVA.W_Exceptions._08_Recap.Task1;

public class Demo {

    public static void main(String[] args) {

        Car car = new Car();

        try {
            car.buy(CarCondition.WASTE);
        } catch (Exception ex) {
            System.out.println("Don't buy this car! It's too old and waste!");
        }

        car.drive("rainy");

    }
}
