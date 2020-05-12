import Budget;

public class CalculateTax {

    public double calculate(Budget budget, Tax tax) {
        
        double taxCalculated = tax.calculate(budget);

        return taxCalculated;
    }
}