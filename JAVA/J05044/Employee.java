package J05044;

public class Employee {
    static int quantity = 1;
    
    private String id;
    private String name;
    private String duty;
    private int basicSalary;
    private int workDays;

    public Employee(String name, String duty, int basicSalary, int workDays) {
        this.id = "NV" + String.format("%02d", quantity++);
        this.name = name;
        this.duty = duty;
        this.basicSalary = basicSalary;
        this.workDays = workDays;
    }
    
    public String getDuty() {
        return this.duty;
    }
    
    public int getDutyExtra() {
        if(this.duty.equals("GD")) {
            return 500;
        } else if(this.duty.equals("PGD")) {
            return 400;
        } else if(this.duty.equals("TP")) {
            return 300;
        } else if(this.duty.equals("KT")) {
            return 250;
        } 
        return 100;
    }
    
    public int getSalary() {
        return this.basicSalary * this.workDays;
    } 
    
    public int getEarlyReceive() {
        if((getDutyExtra() + getSalary()) * 2/3f < 25000) {
            return Math.round((getDutyExtra() + getSalary()) * 2/3f / 1000) * 1000;
        }
        return 25000;
    }
    
    public int getLeftMoney() {
        return getSalary() + getDutyExtra() - getEarlyReceive();
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + getDutyExtra() + " " + getSalary() + " " + getEarlyReceive() + " " + getLeftMoney();
    }
}