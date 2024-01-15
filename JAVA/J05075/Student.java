package J05075;

public class Student {
    
    private String id;
    private String name;
    private String group;
    private int regular;

    public Student(String id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getGroup() {
        return this.group;
    }
    
    public void setChuyenCan(String s) {
        int regular = 10;
        for(int i = 0; i < 10; i++) {
            if(s.charAt(i) == 'v') {
                regular -= 2;
            } else if(s.charAt(i) == 'm') {
                regular -= 1;
            }
        }
        this.regular = regular > 0 ? regular : 0;
    }
    
    public String getNote() {
        return this.regular == 0 ? "KDDK" : ""; 
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.group + " " + this.regular + " " + getNote();
    }
}
