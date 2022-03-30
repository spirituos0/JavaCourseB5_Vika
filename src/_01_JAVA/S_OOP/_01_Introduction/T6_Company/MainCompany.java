package _01_JAVA.S_OOP._01_Introduction.T6_Company;

public class MainCompany {

    public static void main(String[] args) {

        Company steinway = new Company();

        steinway.companyName = "Steinway & Sons";
        steinway.yearCompanyFounded = 1853;
        steinway.companyField = "Piano making company";
        steinway.ownerOfCompany = "Paulson & Co. Inc";

        steinway.hireEmployee("Vika", "Pianist", 000-00-0000);
        steinway.printProperties();
        steinway.fireEmployee();
        steinway.printProperties();
    }
}
