public class Budget {

    private final double amount;
    private List<Item> items;

    public Budget(double amount) {
        this.amount = amount;
        items = new List();
    }

    public double getAmount() {
        return this.amount;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public List<Item> getItem() {
        return Collection.unmodifiableList(this.items);
    }

}