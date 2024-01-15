package J06003;

public class Student {
    
    private String id;
    private String name;
    private String phoneNum;
    private int sttGroup;

    public Student(String id, String name, String phoneNum, int sttGroup) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.sttGroup = sttGroup;
    }

    public int getSttGroup() {
        return sttGroup;
    }
    
    
    @Override
    public String toString() {
        return id + " " + name + " " + phoneNum;
    }
}
