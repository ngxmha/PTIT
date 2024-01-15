package J04012;

public class Employee{
	private String code, name, pos;
	private int basicSalary, dayOfWork; 

	public Employee(String name, int basicSalary, int dayOfWork, String pos){
		code = "NV01";
		this.name = name;
		this.basicSalary = basicSalary;
		this.dayOfWork = dayOfWork;
		this.pos = pos;
	}

	public String toString(){
		int salary = dayOfWork * basicSalary;
		int bonus = 0;
		if(dayOfWork >= 25){
			bonus = (int)(salary * 0.2f);
		} else if(dayOfWork >= 22 && dayOfWork < 25){
			bonus = (int)(salary * 0.1f);
		}

		int extra;
		if(pos.equals("GD")){
			extra = 250000;
		} else if(pos.equals("PGD")){
			extra = 200000;
		} else if(pos.equals("TP")){
			extra = 180000;
		} else {
			extra = 150000;
		}

		return code + " " + name + " " + salary + " " + bonus + " " + extra + " " + (salary + bonus + extra);
	}
}
