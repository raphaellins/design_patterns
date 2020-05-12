import Budget;

public class CalculateTax {

    public double calculate(Budget budget, String tax) {

        double taxCalculated = 0.0;

        if (tax.equals("ICMS")) {
            taxCalculated = budget.getAmount() * 0.1;
        } else if (tax.equals("ISS")) {
            taxCalculated = budget.getValor() * 0.06;
        }

        return taxCalculated;
    }
}