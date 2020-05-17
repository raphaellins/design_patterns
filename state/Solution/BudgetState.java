public interface BudgetState {

    void applyExtraDiscount(Budget budget);

    void approve(Budget budget);
    void invalid(Budget budget);
    void finished(Budget budget);
    
}