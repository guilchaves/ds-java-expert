package section10.entities;

public class Employee {
    Integer id;
    String name;
    Double salary;

    public Employee() {
        super();
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage){
        setSalary((salary * percentage / 100) + salary);
    }
}
