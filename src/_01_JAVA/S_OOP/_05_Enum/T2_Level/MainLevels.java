package _01_JAVA.S_OOP._05_Enum.T2_Level;

public class MainLevels {

    public static void main(String[] args) {

        WaterLevel boiler = new WaterLevel(Level.HIGH);

        switch (boiler.getWaterLevel()) {

            case LOW:
                System.out.println("Water level is low!");
                break;
            case MEDIUM:
                System.out.println("Water leve is medium!");
                System.out.println("That is good");
                break;
            case HIGH:
                System.out.println("Water level is high!");
            default:
                System.out.println("the water level is not recognized!");
        }

    }
}
