package J05079;

public class Subject {
    
    private String id;
    private String name;
    private String group;
    private String nameInstructor;

    public Subject(String id, String name, String group, String nameInstructor) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.nameInstructor = nameInstructor;
    }   

    public String getName() {
        return this.name;
    }
    
    public String getId() {
        return this.id;
    }

    public String getNameInstructor() {
        return this.nameInstructor;
    }
    
    public String getGroup() {
        return this.group;
    }
    
    @Override
    public String toString() {
        return this.group + " " + this.nameInstructor;
    } 
    
}
