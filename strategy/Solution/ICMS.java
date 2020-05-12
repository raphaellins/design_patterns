public class ICMS implements Tax {

    public double calculate(Budget budget) {
        return budget.getAmount() * 0.1;
    }
}