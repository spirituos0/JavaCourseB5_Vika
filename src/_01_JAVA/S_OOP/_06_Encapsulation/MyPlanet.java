package _01_JAVA.S_OOP._06_Encapsulation;

public class MyPlanet {

    //these variables are not gonna change
    // by making it private we hide it from user
    private String planet = "Earth";
    private String satellite = "Moon";
    private int daysInAYear = 365;

    // read-only getter method
    public String getPlanet() {
        return planet;
    }
    public String getSatellite() {
        return satellite;
    }
    public int getDaysInAYear() {
        return daysInAYear;
    }

    // setter method for planet field
    public void setPlanet(String planet) {
        this.planet = planet;
    }
    //setter for satellite field
    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }
    // setter for daysInAYear foeld
    public void setDaysInAYear(int daysInAYear) {
        this.daysInAYear = daysInAYear;
    }


}
