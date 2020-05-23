package observer.Solution;

public class FiscalNoteFactory {

    List<PostProcesor> actions; //bean or add mannually

    public FiscalNote build(){

        FiscalNote newFiscalNote = new FiscalNote();

       actions.forEach((e) => e.executa(newFiscalNote));
       //other execution 
       //other exection
    }
    
}