package _01_JAVA.S_OOP._10_Abstract._06_FoodPack;

public class Baklava extends Sweet {

    // we already implemented taste() method in the Sweet class,
    // so that's why we don't have an error here and ain't have no more implement it here
    @Override
    public void madeIn() {
        System.out.println("Made in Turkey");
    }

    /* Next step is not necessary, we already have it in the Sweet class and
       if we call this method from Baklava without following override,
       we will get the result, that we made in the Sweet class */
    @Override
    public void taste() {
        System.out.println("Baklava tastes sweet inside and crispy outside");
    }

}
