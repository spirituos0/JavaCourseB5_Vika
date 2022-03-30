package _01_JAVA.W_Exceptions._08_Recap.Task1;

public class Car {

    public void buy(CarCondition carCondition) throws Exception {

        if (carCondition.equals(CarCondition.OLD) || carCondition.equals(CarCondition.WASTE)) {
            throw new Exception();
        } else {
            System.out.println("It's okay to buy this car");
        }
    }

    public void drive(String weatherCondition) {
        if (weatherCondition.equalsIgnoreCase("normal")) {
            System.out.println("You can drive the car!");
        } else {
            throw new RuntimeException();
        }
    }

}
