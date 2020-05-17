public abstract class Tax {

    protected Tax otherTax;

    public Tax(Tax otherTax) {
        this.otherTax = otherTax;
    }

    public Tax() {

    }

    protected abstract double calculate(Budget budget);

    protected double otherTaxCalculate(Budget budget) {
        if (this.otherTax == null) {
            return 0;
        }

        return this.otherTax.calculate(budget);
    }
}