package J04007;

public class Employee{
	private String code, name, gender, date, addr, codeFax, day;

	public Employee(String name, String gender, String date, String addr, String codeFax, String day){
		code = "00001";
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.addr = addr;
		this.codeFax = codeFax;
		this.day = day;
	}

	public String toString(){
		return code + " " + name + " " + gender + " " + date + " " + addr + " " + codeFax + " " + day;
	}
}
