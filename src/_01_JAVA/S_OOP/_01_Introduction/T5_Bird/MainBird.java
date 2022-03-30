package _01_JAVA.S_OOP._01_Introduction.T5_Bird;

public class MainBird {

    public static void main(String[] args) {

        Bird eagle = new Bird();

        eagle.color = "Grey";
        eagle.age = 7;
        eagle.type = "Bald Eagle";
        // for String[] listOfNeeds = new String[3]
        eagle.listOfNeeds[0] = "Eating";
        eagle.listOfNeeds[1] = "Water";
        eagle.listOfNeeds[2] = "Cage";


        eagle.ownerInfo = new Owner();

        eagle.ownerInfo.name = "Matthew";
        eagle.ownerInfo.age = 25;
        eagle.ownerInfo.gender = "Male";


    }
}
