package J05040;

public class Employee {
    
    static int quantity = 1;
    
    private String id;
    private String name;
    private int salaryWorkDay;
    private int workDays;
    private String duty;

    public Employee(String name, int salaryWorkDay, int workDays, String duty) {
        this.id = "NV" + String.format("%02d", quantity++);
        this.name = name;
        this.salaryWorkDay = salaryWorkDay;
        this.workDays = workDays;
        this.duty = duty;
    }
    
    public int getWageMonth() {
        return this.salaryWorkDay * this.workDays;
    }
    
    public int getBonus() {
        if(this.workDays >= 25) {
            return (int)(0.2 * getWageMonth());
        } else if(this.workDays >= 22) {
            return (int)(0.1 * getWageMonth());
        }
        return 0;
    }
    
    public int getExtra() {
        if(this.duty.equals("GD")) {
            return 250000;
        } else if(this.duty.equals("PGD")) {
            return 200000;
        } else if(this.duty.equals("TP")) {
            return 180000;
        }
        return 150000;
    }
    
    public int getTolal() {
        return getWageMonth() + getBonus() + getExtra();
    }
    
    @Override
    public String toString() {
        return this.id + " " + this.name + " " + getWageMonth() + " " + getBonus() + " " + getExtra() + " " + getTolal();
    }
}
