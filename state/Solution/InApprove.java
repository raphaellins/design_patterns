public class InApprove implements BudgetState {

    public void applyExtraDiscount(Budget budget) {
        this.amount = this.amount - (this.amount * 0.05);
    }

    public void approve(Budget budget) {
        budget.currentState = new Approved();
    }

    public void invalid(Budget budget) {
        budget.currentState = new NotApproved();
    }

    public void finished(Budget budget) {
        throw new RuntimeException("Invalid State flow");
    }

}