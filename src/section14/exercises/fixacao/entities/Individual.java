package section14.exercises.fixacao.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }


    @Override
    public Double taxesPaid() {
        double incomeLimit = 2000.00;
        double totalPaid = 0.0;

        if (super.getAnnualIncome() < incomeLimit) {
            totalPaid = super.getAnnualIncome() * 0.15;
        }

        if (super.getAnnualIncome() >= incomeLimit) {
            totalPaid = super.getAnnualIncome() * 0.25;
        }

        return totalPaid - (healthExpenditures / 2);
    }
}
