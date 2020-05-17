public class ICPP extends TaxConditional {

    public double minimumTax(Budget budget) {
        return budget.getAmount() * 0.06;
    }

    public double maximumTax(Budget budget) {
        return budget.getAmount() * 0.10;
    }

    public boolean useMaximumTax(Budget budget) {
        return budget.getAmount() > 500;
    }

}