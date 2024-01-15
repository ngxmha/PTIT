package J05024;

public class Student {

    private String id;
    private String name;
    private String stClass;
    private String email;

    public Student(String id, String name, String stClass, String email) {
        this.id = id;
        this.name = name;
        this.stClass = stClass;
        this.email = email;
    }

    public String getId() {
        return this.id;
    }
    
    public String getStClass() {
        return this.stClass;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + stClass + " " + email;
    }
}