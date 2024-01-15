package HELLOJAR;

public class Subject {
    private String codeSub, nameSub;
    private byte credits;
    
    public Subject(String codeSub, String nameSub, byte credits) {
        this.codeSub = codeSub;
        this.nameSub = nameSub;
        this.credits = credits;
    }
    
    public String getName(){
        return nameSub;
    }
    
    public byte getCredits(){
        return credits;
    }
}
