package builder.Solution;

public class FiscalNoteFactory {

    public void toBuilder(){
        return this;
    }

    public void toCnpj(){
        return this;
    }
    
    public void withItems(ItemNote itemNote){
        allItems.add(itemNote);
        //add new occurrency
        return this;
    }

    public withDescription(String description){
        this.description = description;

        return this;
    }
}