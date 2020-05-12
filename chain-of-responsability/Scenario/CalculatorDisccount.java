public class CalculatorDisccount {

    public double calculate(Budget budget) {

        if (budget.getItems().size() > 5) {
            return budget.getAmount() * 0.1;
        }

        else if (budget.getAmount() > 500.00) {
            return budget.getAmount() * 0.7;
        }

        return 0;
    }
}