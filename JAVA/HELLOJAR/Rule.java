package HELLOJAR;

public class Rule {
    private String codeRu, nameRu;
    private int unitPrice;

    public Rule(String codeRu, String nameRu, int unitPrice) {
        this.codeRu = codeRu;
        this.nameRu = nameRu;
        this.unitPrice = unitPrice;
    }

    
    
    public String getCode(){
        return codeRu;
    }
    
    public int getUnitPrice(){
        return unitPrice;
    }
}
