public class NotApproved implements BudgetState {

    public void applyExtraDiscount(Budget budget) {
        throw new RuntimeException("Budget not approved");
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