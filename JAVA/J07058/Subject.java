package J07058;

public class Subject {
    private String id, name, form;

    public String getId(){
        return id;
    }
    
    public Subject(String id, String name, String form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + form;
    }
}
