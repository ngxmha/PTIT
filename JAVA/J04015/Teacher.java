package J04015;

public class Teacher{
	private String code, name;
	private int basicSalary;

	public Teacher(String code, String name, int basicSalary){
		this.code = code;
		this.name = name;
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString(){
		int extra;
		if(code.substring(0, 2).equals("HT")){
			extra = 2000000;
		} else if (code.substring(0, 2).equals("HP")){
			extra = 900000;
		} else {
			extra = 500000;
		}

		return code + " " + name + " " + Integer.parseInt(code.substring(2)) + " " + extra + " " + (basicSalary * Integer.parseInt(code.substring(2)) + extra);
	}
}
