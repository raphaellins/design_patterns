public abstract class TaxConditional implements Tax {

    public double calculate(Budget budget) {

        if (useMaximumTax(budget)) {
            return maximumTax(budget);
        } else {
            return minimumTax(budget);
        }
    }

    public abstract boolean useMaximumTax(Budget budget);

    public abstract double maximumTax(Budget budget);

    public abstract double minimumTax(Budget budget);
}