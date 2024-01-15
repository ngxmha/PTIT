package J05057;

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
    
    @Override
    public String toString(){
        float prio = 0;
        if(code.charAt(2) == '1'){
            prio = 0.5f;
        } else if(code.charAt(2) == '2'){
            prio = 1.0f;
        } else {
            prio = 2.5f;
        }

        float total = (float)markMath * 2 + markPhys + markChem;
            
        return code + " " + name + " " + formatRealNumber(prio) + " " + formatRealNumber(total) + " " + (total + prio >= 24 ? "TRUNG TUYEN" : "TRUOT");        
    }
}
