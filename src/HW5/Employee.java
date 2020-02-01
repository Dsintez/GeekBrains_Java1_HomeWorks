package HW5;

public class Employee {
    private static int idCounter = 0;
    private final int ID;
    private String lastName; //Фамилия
    private String firstName; //Имя
    private String middleName; //Отчество
    private String position; //Должность
    private String email;
    private String phoneNumber;
    private int salary; //Зарплата
    private int age;

    public Employee(String lastName, String firstName, String middleName, String position, String email, String phoneNumber, int salary, int age) {
        this.ID = idCounter;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
        idCounter++;
    }

    public int getID() {
        return ID;
    }

    public String getPosition() {
        return position;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                '}';
    }
}
