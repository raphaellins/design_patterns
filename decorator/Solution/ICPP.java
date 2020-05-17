public class ICPP extends Tax {

    public ICPP(Tax tax) {
        super(tax);
    }

    public ICPP(){
        super();
    }

    public double calculate(Budget budget) {
        return budget.getAmount() * 0.3 + otherTaxCalculate(budget);
    }
}