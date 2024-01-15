package HELLOJAR;

public class Student {
    private String codeSt, nameSt;
    
    public Student(String codeSt, String nameSt){
        this.codeSt = codeSt;
        this.nameSt = nameSt;
    }
    
    public String getCode(){
        return codeSt;
    }
    
    public String getName(){
        return nameSt;
    }
}
