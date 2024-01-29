package section20.exercises.exercise09.entities;

public class Employee {
    private String name;
    private String email;
    private Double salary;

    public Employee(String name, String email, Double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getEmail() + ", $" + String.format("%.2f", this.getSalary());
    }
}
