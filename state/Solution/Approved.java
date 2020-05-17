public class Approved implements BudgetState {

    public void applyExtraDiscount(Budget budget) {
        this.amount = this.amount - (this.amount * 0.05);
    }

    public void approve(Budget budget) {
        throw new RuntimeException("Invalid State flow");
    }

    public void invalid(Budget budget) {
        throw new RuntimeException("Invalid State flow");
    }

    public void finished(Budget budget) {
        budget.currentState = new Done();
    }

}