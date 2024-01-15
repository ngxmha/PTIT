package J05035;

public class Student {
    
    static int quantity = 1;
    
    private int order;
    private String id;
    private String name;
    private String Class;
    private String email;
    private String nameEnterprise;

    public Student(String id, String name, String Class, String email, String nameEnterprise) {
        this.order = quantity++;
        this.id = id;
        this.name = name;
        this.Class = Class;
        this.email = email;
        this.nameEnterprise = nameEnterprise;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getNameEnterprise() {
        return this.nameEnterprise;
    }
    
    @Override
    public String toString() {
        return this.order + " " + this.id + " " + this.name + " " + this.Class + " " + this.email + " " + this.nameEnterprise; 
    }
}
