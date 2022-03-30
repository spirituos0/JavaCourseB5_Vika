package _01_JAVA.S_OOP._06_Encapsulation;

public class Student {

    private String name;
    private int age;
    private String country;
    private char grade;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }
}
