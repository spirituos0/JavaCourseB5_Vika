package _01_JAVA.S_OOP._05_Enum.T3_Directions;

public enum Directions {

    // If we have a constructor, we need to call constructor for each constant
    EAST("E"), // with these () we call the constructor...
    WEST("W"), // ...and initialize shortName
    NORTH("N"),
    SOUTH("S");

    final String shortName;

    Directions(String shortName) {
        this.shortName = shortName;
        // constructor requires to initialize each enum
    }
}
