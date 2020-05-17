public class IKCV implements Tax {

    double calculate(Budget budget) {
        if (budget.getAmount() > 500 && hasItemMoreThan100(budget)) {
            return budget.getAmount() * 0.10;
        } else {
            return budget.getAmount() * 0.06;
        }
    }

    hasItemMoreThan100(Budget budget){
        for(Item item: budget.getItems()){
            if(item.getValue() > 100) return true;
        }

        return false; 
    }
}