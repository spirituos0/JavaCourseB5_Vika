package SatProjects.Week_5.T1;

public class Customer {

    String name;
    int age;
    int areaZipCode;
    ElectricityAccount electricityAccount;

    public Customer(String name, int areaZipCode, ElectricityAccount ElectricityAccount) {
        this.name = name;
        this.areaZipCode = areaZipCode;
        this.electricityAccount = ElectricityAccount;

        if (areaZipCode > 1000 && areaZipCode < 3000)
            ElectricityAccount.rate = 0.9;

        else if (areaZipCode > 3000 && areaZipCode < 4500)
            ElectricityAccount.rate = 0.8;

        else if (areaZipCode > 4500 && areaZipCode < 7000)
            ElectricityAccount.rate = 0.6;

        else ElectricityAccount.rate = 0.7;
    }

    public Customer(String name, int age, int areaZipCode, ElectricityAccount ElectricityAccount) {
        this(name, areaZipCode, ElectricityAccount);
        this.age = age;
    }

    public double consumeElectricity(double wph) {
        electricityAccount.totalWPH += wph;
        return electricityAccount.totalWPH;
    }

}
