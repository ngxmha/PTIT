package J07035;

public class Subject {
    
    private String id;
    private String name;
    private int credit;

    public Subject(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
}
