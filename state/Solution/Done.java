public class Done implements BudgetState {

    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Budget already finished");
    }

    public void approve(Budget budget) {
        throw new RuntimeException("Invalid State flow");
    }

    public void invalid(Budget budget) {
        throw new RuntimeException("Invalid State flow");
    }

    public void finished(Budget budget) {
        throw new RuntimeException("Invalid State flow");
    }
}