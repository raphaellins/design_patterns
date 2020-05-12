public class DiscountPromoOne implements Discount {

    private Discount nextDiscount;

    public double discount(Budget budget) {
        if (budget.getItems().size() > 5) {
            return budget.getAmount() * 0.1;
        }

        return nextDiscount.discount(budget);
    }

    public void setNext(Discount discount) {
        this.nextDiscount = discount;
    }
}