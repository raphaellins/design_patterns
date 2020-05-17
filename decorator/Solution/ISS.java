public class ISS extends Tax {

    public ISS(Tax tax) {
        super(tax);
    }

    public ISS() {
        super();
    }

    public double calculate(Budget budget) {
        return budget.getAmount() * 0.6 + otherTaxCalculate(budget);
    }

}