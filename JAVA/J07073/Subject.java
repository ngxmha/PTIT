package J07073;

public class Subject implements Comparable<Subject>
{
    private String id;
    private String name;
    private int credit;
    private String theory;
    private String practice;

    public Subject(String id, String name, int credit, String theory, String practice)
    {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.theory = theory;
        this.practice = practice;
    }

    public String getId()
    {
        return id;
    }

    public String getPractice()
    {
        return practice;
    }
    
    @Override
    public int compareTo(Subject s)
    {
        return id.compareTo(s.id);
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + credit + " " + theory + " " + practice;
    }
    
}
