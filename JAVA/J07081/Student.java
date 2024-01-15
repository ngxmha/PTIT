package J07081;

public class Student implements Comparable<Student>
{
    private String id;
    private String name;
    private String phone;
    private String email;

    public Student(String id, String name, String phone, String email) 
    {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }
    
    @Override
    public int compareTo(Student st)
    {
        if(!name.equals(st.name))
        {
            String[] arr1 = name.split(" ");
            String[] arr2 = st.name.split(" ");
            if(arr1[arr1.length - 1].equals(arr2[arr2.length - 1]))
            {
                int i = 0, j = 0;
                while(i < arr1.length - 1 && j < arr2.length - 1)
                {
                    if(!arr1[i].equals(arr2[i]))
                        return arr1[i].compareTo(arr2[i]);
                    i++;
                    j++;
                }
            }
            return arr1[arr1.length - 1].compareTo(arr2[arr2.length - 1]);
        }
        return id.compareTo(st.id);
    }
    
    @Override
    public String toString()
    {
        return id + " " + name + " " + phone + " " + email;
    }
    
}
