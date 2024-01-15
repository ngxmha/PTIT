package HELLOJAR;

import java.util.ArrayList;

public class Invoice {
    private Student st;
    private ArrayList<Subject> arr;
    private Rule r;

    public Invoice(Student st, ArrayList<Subject> arr, Rule r) {
        this.st = st;
        this.arr = arr;
        this.r = r;
    }
    
    
    public Student getSt(){
        return st;
    }
    
    public ArrayList<Subject> getAlSubject(){
        return arr;
    }
    
    public double getAmount(){
        double fee = 0;
        for(Subject sj : arr){
            fee += sj.getCredits() * r.getUnitPrice();
        }
        return fee;
    }
    
    public Rule getRule(){
        return r;
    }
}
