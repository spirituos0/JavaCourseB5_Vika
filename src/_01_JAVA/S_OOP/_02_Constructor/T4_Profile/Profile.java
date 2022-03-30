package _01_JAVA.S_OOP._02_Constructor.T4_Profile;

public class Profile {

    String firstName;
    String lastName;
    String address;
    String birthDate;
    String phone;
    String email;
    String nickname;

    // Constructor 1
    public Profile(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Constructor 2
    public Profile(String firstName, String lastName, String birthDate) {
        this(firstName, lastName); // using constructor 1
        // we are calling the constructor in this step
        // if we call the constructor, it should be in the beginning, otherwise, it won't work
        this.birthDate = birthDate;
    }
    // Constructor 3
    public Profile(String firstName, String lastName, String address,
                   String birthDate, String phone, String email, String nickname) {
        this(firstName, lastName, birthDate); // using Constructor 2
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.nickname = nickname;
    }


}
