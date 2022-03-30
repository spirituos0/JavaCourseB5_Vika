package _01_JAVA.S_OOP._01_Introduction.T6_Company;

public class Company {

    String companyName;
    int yearCompanyFounded;
    String companyField;
    String ownerOfCompany;
    Employee employee;

    public void hireEmployee(String employeeName, String title, int ssn) {
        System.out.println(employee);
    }

    public void fireEmployee() {
        employee = null;

    }
    public void printProperties() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Year " + companyName + " Founded " + yearCompanyFounded);
        System.out.println("Company Field: " + companyField);
        System.out.println("Owner of Company: " + ownerOfCompany);
        if (employee != null)
            employee.printProperties();
    }
}
