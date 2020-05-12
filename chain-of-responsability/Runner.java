public class Runner {

    public static void main(String[] args) {

        CalculatorDiscount calculator = new CalculatorDiscount();

        Budget budget = new Budget(500.00);

        budget.addItem(new Item("Pen", 250.00));
        budget.addItem(new Item("Notebook", 250.0));

        double finalDiscount = calculator.calculate(budget);
        
    }   
}