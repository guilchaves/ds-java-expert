package section14.exercises.fixacao.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double annualIncome, int numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public Double taxesPaid() {
        if (numberOfEmployees < 10) {
            return super.getAnnualIncome() * 0.16;
        }

        return super.getAnnualIncome() * 0.14;
    }
}
