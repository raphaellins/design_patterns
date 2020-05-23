package other.Scenario;

public class FiscalNoteFactory {

    public FiscalNote build(){

        FiscalNote newFiscalNote = new FiscalNote();

       new SendEmail().sendEmail(newFiscalNote);
       //other execution 
       //other exection
    }
    
}