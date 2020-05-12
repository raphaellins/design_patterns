public class NoDiscount implements Discount {

    public double discount(Budget budget) {
        return 0;
    }

    public setNextDiscount(Discount discount){
        //Do Nothing
    }
}