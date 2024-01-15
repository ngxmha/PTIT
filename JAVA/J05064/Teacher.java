package J05064;

public class Teacher {
    
    private String id;
    private String name;
    private int basicSalary;

    public Teacher(String id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getSalaryLevel() {
        return Integer.parseInt(this.id.substring(2));
    }    
    
    public int getPhuCap() {
        if(this.id.substring(0, 2).equals("HT")) {
            return 2000000;
        } else if(this.id.substring(0, 2).equals("HP")) {
            return 900000;
        }
        return 500000;
    }
    
    public int getSalary() {
        return this.basicSalary * getSalaryLevel() + getPhuCap();
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + getSalaryLevel() + " " + getPhuCap() + " " + getSalary();
    }
}
