package J07036;

public class Student {
    
    private String id;
    private String name;
    private String group;
    private String email;

    public Student(String id, String name, String group, String email) {
        this.id = id;
        this.name = standardName(name);
        this.group = group;
        this.email = email;
    }
    
    public String standardName(String s)
    {
        String name = "";
        
        String[] arr = s.trim().split("\\s+");
        for(int i = 0; i < arr.length; i++)
        {
            name += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";
        }
        
        return name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }
    
}
