package J05058;

public class Candidate{
    private String code, name;
    private float markMath, markPhys, markChem;

    public Candidate(String code, String name, float markMath, float markPhys, float markChem){
        this.code = code;
        this.name = name;
        this.markMath = markMath;
        this.markPhys = markPhys;
        this.markChem = markChem;
    }
    
    public String formatRealNumber(float a){
        if(a == (int)a){
            return String.format("%.0f", a);
        }
        return "" + a;
    }
    
    public String getCode() {
        return code;
    }
    
    public float getPrio() {
        if(code.charAt(2) == '1'){
            return 0.5f;
        } else if(code.charAt(2) == '2'){
            return 1.0f;
        }
        return 2.5f;
    }
    
    public float getTotal() {
       return (float)markMath * 2 + markPhys + markChem + getPrio(); 
    }  
    
    @Override
    public String toString(){
        return code + " " + name + " " + formatRealNumber(getPrio()) + " " + formatRealNumber(getTotal()) + " " + (getTotal() >= 24 ? "TRUNG TUYEN" : "TRUOT");        
    }
}
