public class Budget {

    private double amount;
    private List<Item> items;
    private int currentState;

    public static final int IN_APPROVE = 1;
    public static final int APPROVED = 2;

    public Budget(double amount) {
        this.amount = amount;
        items = new List();
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
        if (this.currentState == IN_APPROVE) {
            this.amount = this.amount - (this.amount * 0.05);
        } else if (this.currentState == APPROVED) {
            this.amount = this.amount - (this.amount * 0.02);
        } else {
            throw new RuntimeException();
        }
    }

}