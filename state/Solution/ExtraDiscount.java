public class ExtraDiscount {

    public static void main(String[] args) {
        Budget budget = new Budget(500);

        budget.applyExtraDiscount();

        budget.approve();

        budget.applyExtraDiscount();

        budget.finished();

        budget.applyExtraDiscount(); //NOT ALLOWED

    }

}