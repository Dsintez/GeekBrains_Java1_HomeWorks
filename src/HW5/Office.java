package HW5;

public class Office {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov", "Ivan","Ivanovich", "Engineer", "ivivan@mailbox.com", "89231231223", 100000, 25);
        employees[1] = new Employee("Sidorov", "Dmitry","Alekseevich", "Engineer", "ivivan@mailbox.com", "88005553535", 1000000009, 14);
        employees[2] = new Employee("Petrov", "Ivan","Robertovich", "Engineer", "ivivan@mailbox.com", "89544252654", 110000, 23);
        employees[3] = new Employee("Vasil'ev", "Ivan","Palych", "Engineer", "ivivan@mailbox.com", "89231231245", 90000, 41);
        employees[4] = new Employee("Sina", "Jon","Igorevich", "Engineer", "ivivan@mailbox.com", "89231231221", 99000, 34);

        for (Employee employee : employees) {
            if (employee.getAge()>40) System.out.println(employee);
        }
    }
}
