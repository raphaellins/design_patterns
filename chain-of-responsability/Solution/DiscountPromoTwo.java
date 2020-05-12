public class DiscountPromoTwo implements Discount {

    private Discount nextDiscount;

    public double discount(Budget budget) {
        if (budget.getAmount() > 500.0) {
            return budget.getAmount() * 15.0;
        }

        return nextDiscount.discount(budget);
    }

    public void setNext(Discount discount) {
        this.nextDiscount = discount;
    }
}