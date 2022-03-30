package _01_JAVA.S_OOP._01_Introduction.T5_Bird;

public class MainFish {

    public static void main(String[] args) {

        Fish starFish = new Fish();
        starFish.age = 1;
        starFish.color = "Orange";
        starFish.type = "Morning Sun Starfish";

        starFish.listOfNeeds = new String[2];
        starFish.listOfNeeds[0] = "Eating";
        starFish.listOfNeeds[1] = "Breathing";

        starFish.ownerInfo = new Owner();
        starFish.ownerInfo.name = "Vika";
        starFish.ownerInfo.age = 24;
        starFish.ownerInfo.gender = "Female";

        starFish.printProperties();

    }



}
