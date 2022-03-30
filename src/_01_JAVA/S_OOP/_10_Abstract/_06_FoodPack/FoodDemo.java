package _01_JAVA.S_OOP._10_Abstract._06_FoodPack;

public class FoodDemo {

    public static void main(String[] args) {

        Baklava baklava = new Baklava();

        baklava.taste();
        baklava.madeIn();

        System.out.println("-----------");

        CheeseCake cheeseCake = new CheeseCake();

        cheeseCake.taste();
        cheeseCake.madeIn();

        System.out.println("-----------");

        GreekSalad greekSalad = new GreekSalad();

        greekSalad.taste();
        greekSalad.madeIn();

        System.out.println("------------");

        CesarSalad cesarSalad = new CesarSalad();

        cesarSalad.taste();
        cesarSalad.madeIn();

    }
}
