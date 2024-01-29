package section08.entities;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void increaseSalary(double percentage){
        double salaryRaise = percentage / 100 * this.grossSalary;
        this.setGrossSalary(salaryRaise + this.grossSalary);
    }

   public double netSalary(){
       return this.grossSalary - this.tax;
   }

    @Override
    public String toString() {
        return "Employee: " + getName() + ", $ " + String.format("%.2f", netSalary());
    }
}
