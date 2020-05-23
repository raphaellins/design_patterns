package other.Scenario;

import java.time.LocalDateTime;
import java.util.List;

public class FiscalNote {

    private String socialNumber;
    private String cnpj;
    private LocalDateTime emissionDate;
    private double budget;
    private double tax;
    public List<Item> items;
    public String observations;
}