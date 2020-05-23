package flyweight.Solution;

public class MusicNotes {

    private static Map<String, Note> notes = new Map();

    static {
        notes.put('do', new Do());
    }
    

    public Note get(String name){
        return notes.get(name);
    }
}