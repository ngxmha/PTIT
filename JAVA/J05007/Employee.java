package J05007;

public class Employee {
    static byte num = 1;
    private String id, name, gender, dob, address, idFax, dateContract;

    public Employee(String name, String gender, String dob, String address, String idFax, String dateContract) {
        id = String.format("%05d", num++);
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.idFax = idFax;
        this.dateContract = dateContract;
    }
    
    public String getDob(){
        return dob;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + gender + " " + dob + " " + address + " " + idFax + " " + dateContract;
    }
}
