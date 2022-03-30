package _01_JAVA.S_OOP._06_Encapsulation;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Halit");
        employee.setBaseSalary(90_000);
        employee.setHourlyRate(55);
        System.out.println(employee.getName());

        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());

        int wage = employee.calculateWage(12);
        System.out.println("Wage: " + wage);

//        We should make sure rate is not < 0
//        int baseSalary = 90_000;
//        int hourlyRate = 45;
//        int extraHours = 10;

//        int wage = calculateWage(baseSalary, hourlyRate, extraHours);
//        System.out.println(wage);


//    public static int calculateWage(
//            int baseSalary,
//            int hourlyRate,
//            int extraHours
//    ) {
//        return baseSalary + (hourlyRate * extraHours);
//    }
    }
}
