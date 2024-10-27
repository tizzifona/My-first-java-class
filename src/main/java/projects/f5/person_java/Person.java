package projects.f5.person_java;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;

    public Person(String firstName, String lastName, String idNumber, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void printDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
    }
}