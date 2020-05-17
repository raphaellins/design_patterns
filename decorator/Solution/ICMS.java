public class ICMS extends Tax {

    public ICMS(Tax tax) {
        super(tax);
    }

    public ICMS(){
        super();
    }

    public double calculate(Budget budget) {
        return budget.getAmount() * 0.1 + otherTaxCalculate(budget);
    }
}