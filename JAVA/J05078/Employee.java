package J05078;

public class Employee {
    
    private String id;
    private String name;
    private int basicSalary;
    private int workDay;
    private Department dep;

    public Employee(String id, String name, int basicSalary, int workDay, Department dep) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary * 1000;
        this.workDay = workDay;
        this.dep = dep;
    }
    
    public String getId() {
        return this.id;
    }
    
    public int getHeSo() {
        int year = Integer.parseInt(this.id.substring(1, 3));
        char c = this.id.charAt(0);
        int heSo;
        if(c == 'A') {
            if(year >= 1 && year <= 3) 
                heSo = 10;
            else if(year >= 4 && year <= 8)
               heSo = 12;
            else if(year >= 9 && year <= 15)
                heSo = 14;
            else 
                heSo = 20;
            
        } else if(c == 'B') {
            if(year >= 1 && year <= 3) 
                heSo = 10;
            else if(year >= 4 && year <= 8)
               heSo = 11;
            else if(year >= 9 && year <= 15)
                heSo = 13;
            else 
                heSo = 16;
            
        } else if(c == 'C') {
            if(year >= 1 && year <= 3) 
                heSo = 9;
            else if(year >= 4 && year <= 8)
               heSo = 10;
            else if(year >= 9 && year <= 15)
                heSo = 12;
            else 
                heSo = 14;
       
        } else {
            if(year >= 1 && year <= 3) 
                heSo = 8;
            else if(year >= 4 && year <= 8)
               heSo = 9;
            else if(year >= 9 && year <= 15)
                heSo = 11;
            else 
                heSo = 13;
        }
        return heSo;
    }
    
    public int getSalary() {
        return this.basicSalary * this.workDay * getHeSo();
    }
    
    @Override
    public String toString() {
        return this.id  + " " + this.name + " " + getSalary();
    }
}
