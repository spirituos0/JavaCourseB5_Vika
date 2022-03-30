package _01_JAVA.S_OOP._06_Encapsulation;

public class ApplicationMain {

    public static void main(String[] args) {

        Application competition = new Application();

        competition.setParticipantName("Viktoria Anikina");
        competition.setAmountOfPieces((byte) 2);
        competition.setNamesOfThePieces("\n1. J.S.Bach Prelude and Fugue No 8, Book 1; " +
                "\n2. F.Chopin Concerto No 1, f-moll, Movement 1st");
        competition.setTotalTimeOfPerformance(41);

        System.out.println("Participant: " + competition.getParticipantName());
        System.out.println("Amount of pieces participant is going to perform: " + competition.getAmountOfPieces());
        System.out.println("Names of the pieces: " + competition.getNamesOfThePieces());
        System.out.println("Total amount of time of the performance: " + competition.getTotalTimeOfPerformance() + " min");

    }
}
