public class ComplexTax {

    public static void main(String[] args) {
        Tax iss = new ISS(new ICMS(new ICPP()));
        
        Budget budget = new Budget(500);

        double taxCalculated = iss.calculate(budget);
    }

}