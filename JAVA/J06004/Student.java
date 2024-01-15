package J06004;

public class Student {
    
    private String id;
    private String name;
    private String phoneNum;
    private int sttGroup;
    private String nameGroup;
    
    public Student(String id, String name, String phoneNum, int sttGroup) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.sttGroup = sttGroup;
    }
    
    public String getId() {
        return id;
    }
    
    public int getSttGroup() {
        return sttGroup;
    }
    
    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }
    
    @Override
    public String toString() {
        return id + " " + name + " " + phoneNum + " " + sttGroup + " " + getNameGroup();
    }
}
