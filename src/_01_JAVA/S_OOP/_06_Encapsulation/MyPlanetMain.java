package _01_JAVA.S_OOP._06_Encapsulation;

public class MyPlanetMain {

    public static void main(String[] args) {

        MyPlanet Halit = new MyPlanet();

        System.out.println("Halit's planet: " + Halit.getPlanet());
        System.out.println("Halit's satellite: " + Halit.getSatellite());
        System.out.println("Halit's days in a year: " + Halit.getDaysInAYear());

        MyPlanet astronaut = new MyPlanet();
        // astronaut (object) is moving to a different planet, so we need to update the fields.
        // we created setter method for updating
        astronaut.setPlanet("Mars");
        astronaut.setSatellite("Phobos");
        astronaut.setDaysInAYear(687);

        System.out.println("Astronaut's planet: " + astronaut.getPlanet());
        System.out.println("Astronaut's satellite: " + astronaut.getSatellite());
        System.out.println("Astronaut's days in a year: " + astronaut.getDaysInAYear());
    }
}
