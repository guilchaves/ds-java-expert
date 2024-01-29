package entities;

public class TaxPayer {

    private Double salaryIncome;
    private Double servicesIncome;
    private Double capitalIncome;
    private Double healthSpending;
    private Double educationSpending;

    public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    public Double getSalaryIncome() {
        return salaryIncome;
    }

    public Double getServicesIncome() {
        return servicesIncome;
    }

    public Double getCapitalIncome() {
        return capitalIncome;
    }

    public Double getHealthSpending() {
        return healthSpending;
    }

    public Double getEducationSpending() {
        return educationSpending;
    }

    public Double salaryTax() {
        Double monthlyIncome = salaryIncome / 12;
        if (monthlyIncome > 3000 && monthlyIncome < 5000) {
            return salaryIncome * 0.1;
        }

        if (monthlyIncome >= 5000) {
            return salaryIncome * 0.2;
        }
        return 0.0;
    }

    public Double servicesTax() {
        return (servicesIncome != 0.0) ? servicesIncome * 0.15 : 0.0;
    }

    public Double capitalTax() {
        return (capitalIncome != 0.0) ? capitalIncome * 0.2 : 0.0;
    }

    public Double grossTax() {
        return salaryTax() + servicesTax() + capitalTax();
    }

    public Double taxRebate() {
        Double spendings = healthSpending + educationSpending;
        Double maxRebate = grossTax() * 0.3;

        return (spendings > maxRebate) ? maxRebate : spendings;
    }

    public Double netTax(){
        return this.grossTax() - this.taxRebate();
    }
}
