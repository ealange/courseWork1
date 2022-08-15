public class Employee {
    private int employeeCounter = 0;
    private int id;
    private Person person;
    private byte department;
    private int salary;

    public Employee(Person person, byte department, int salary) {
        this.person = person;
        this.department = department;
        this.salary = salary;
        id = employeeCounter;
        employeeCounter = employeeCounter + 1;

    }

    public int getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public byte getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
