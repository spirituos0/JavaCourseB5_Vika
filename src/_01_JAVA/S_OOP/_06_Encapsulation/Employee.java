package _01_JAVA.S_OOP._06_Encapsulation;

public class Employee {

    /* Encapsulation:
    - Bundle all the related data and methods in a single unit
    - Can hide data from user by making fields private
    - Can create getter (read data, get data) and setter (updating,
    initializing or setting data) methods to access private fields
    */
    private String name;
    private int baseSalary; // we hide data by making it private
    private int hourlyRate;
//    int extraHours;
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // Setter method
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary cannot be less than 0");
        this.baseSalary = baseSalary;
    }

    // Getter method
    public int getBaseSalary() {
        return baseSalary;
    }

    // Setter method
    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be less than 0");
        this.hourlyRate = hourlyRate;
    }

    // Getter method
    public int getHourlyRate() {
        return hourlyRate;
    }
}
