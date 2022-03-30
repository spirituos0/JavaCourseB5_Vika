package _01_JAVA.S_OOP._06_Encapsulation;

public class Application {

    private String participantName;
    private byte amountOfPieces;
    private String namesOfThePieces;
    private int totalTimeOfPerformance;

    // getter
    public String getParticipantName() {
        return participantName;
    }
    public String getNamesOfThePieces() {
        return namesOfThePieces;
    }
    public byte getAmountOfPieces() {
        return amountOfPieces;
    }
    public int getTotalTimeOfPerformance() {
        return totalTimeOfPerformance;
    }

    // setter
    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }
    public void setAmountOfPieces(byte amountOfPieces) {
        this.amountOfPieces = amountOfPieces;
    }
    public void setNamesOfThePieces(String namesOfThePieces) {
        this.namesOfThePieces = namesOfThePieces;
    }
    public void setTotalTimeOfPerformance(int totalTimeOfPerformance) {
        this.totalTimeOfPerformance = totalTimeOfPerformance;
    }
}
