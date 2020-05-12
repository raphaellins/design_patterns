public class CalculatorDiscount {

    public double calculate(Budget budget) {

        Discount discountOne = new DiscountPromoOne();

        Discount discountTwo = new DiscountPromoTwo();

        Discount noDiscount = new NoDiscount();

        discountOne.setNexDiscount(discountTwo);
        discountTwo.setNexDiscount(noDiscount);

        return discountOne.discount(budget);
    }
}