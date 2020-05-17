public class Budget {

    protected double amount;
    private List<Item> items;

    protected BudgetState currentState;

    public Budget(double amount) {
        this.amount = amount;
        items = new List();
        currentState = new InApprove();
    }

    public double getAmount() {
        return this.amount;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public List<Item> getItem() {
        return Collection.unmodifiableList(this.items);
    }

    public void applyExtraDiscount() {
        this.currentState.applyExtraDiscount(this);
    }

    public void approve() {
        currentState.approve(this);
    }

    public void invalid() {
        currentState.invalid(this);
    }

    public void finished() {
        currentState.finished(this);
    }

}