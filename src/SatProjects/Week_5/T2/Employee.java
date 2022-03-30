package SatProjects.Week_5.T2;

public class Employee {

    double baseSalary;
    double hourlyRate;
    static int numberOfEmployees;

    public Employee(double baseSalary, double hourlyRate) {

        if (baseSalary <= 0 || hourlyRate < 0)
            throw new IllegalArgumentException("Base salary and hourly rate should nbe greater than 0");
        else {
            this.baseSalary = baseSalary;
            this.hourlyRate = hourlyRate;
        }
    }

    public double calculateWage(double extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
    static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

}
