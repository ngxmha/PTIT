package J07020;

public class Customer 
{
    private static int num = 1;
    
    private String id;
    private String name;
    private String gender;
    private String dob;
    private String address;

    public Customer(String name, String gender, String dob, String address) 
    {
        this.id = "KH" + String.format("%03d", num++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
