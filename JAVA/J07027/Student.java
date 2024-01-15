package J07027;

public class Student implements Comparable<Student>{
    
    private String id;
    private String name;
    private String phone;
    private Exercise exc;

    public Student(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setExc(Exercise exc) {
        this.exc = exc;
    }
    
    @Override
    public int compareTo(Student o)
    {
        return id.compareTo(o.id);
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + phone + " " + exc.getStt() + " " + exc.getName();
    }
}
