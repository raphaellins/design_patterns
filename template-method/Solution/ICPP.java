public class ICPP implements Tax {

    double calculate(Budget budget) {
        if(budget.getAmount() > 500){
            return budget.getAmount() * 0.07;
        }else{
            return budget.getAmount() * 0.05;
        }
    }
}