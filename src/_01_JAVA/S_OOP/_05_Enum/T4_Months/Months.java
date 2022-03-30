package _01_JAVA.S_OOP._05_Enum.T4_Months;

public enum Months {

    JANUARY("Jan"),
    FEBRUARY("Feb"),
    MARCH("Mar"),
    APRIL("Apr"),
    MAY("May"),
    JUNE("Jun"),
    JULY("Jul"),
    AUGUST("Aug"),
    SEPTEMBER("Sep"),
    OCTOBER("Oct"),
    NOVEMBER("Nov"),
    DECEMBER("Dec");

    String shortName;

    Months(String shortName) {
        this.shortName = shortName;
    }
}
