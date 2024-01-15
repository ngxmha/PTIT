package J04006;

public class Student{
	private String name, code, group, date;
	private float gpa;

	public Student(){
		name = "";
		code = "";
		group = "";
		date = "";
		gpa = 0;
	}

	public Student(String name, String group, String date, float gpa){
		this.name = name;
		this.group = group;
		this.date = date;
		this.gpa = gpa;
		code = "B20DCCN001";
	}

	public String toString(){
		String s = date;
		if(s.charAt(1) == '/'){
			s = '0' + s;
		}
		if(s.charAt(4) == '/'){
			s = s.substring(0, 3) + "0" + s.substring(3);
		}
		return code + " " + name + " " + group + " " + s + " " + String.format("%.2f", gpa);
	}
}
