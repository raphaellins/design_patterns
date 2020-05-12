public class Run {

    public static void main(String[] args) {

        Tax iss = new ISS();
        Tax icms = new ICMS();

        Budget budget = new Budget(500.0);

        CalculateTax calculateTax = new CalculateTax();

        calculateTax.calculate(budget, iss);
        calculateTax.calculate(budget, icms);
    }
}