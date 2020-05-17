public class IKCV extends TaxConditional {

    hasItemMoreThan100(Budget budget){
        for(Item item: budget.getItems()){
            if(item.getValue() > 100) return true;
        }

        return false; 
    }

    public double minimumTax(Budget budget) {
        return budget.getAmount() * 0.06;
    }

    public double maximumTax(Budget budget) {
        return budget.getAmount() * 0.10;
    }

    public boolean useMaximumTax(Budget budget) {
        return budget.getAmount() > 500 && hasItemMoreThan100(budget);
    }
}