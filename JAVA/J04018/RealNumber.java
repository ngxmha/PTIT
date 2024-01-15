package J04018;

public class RealNumber {
    private int real, vir;

    public RealNumber(){};
    
    public RealNumber(int real, int vir) {
        this.real = real;
        this.vir = vir;
    }
    
    public RealNumber sumOfTwoRealNumber(RealNumber B){
        return new RealNumber(real + B.real, vir + B.vir);
    }
    
    public RealNumber calculationC(RealNumber B){
        RealNumber sum = sumOfTwoRealNumber(B);
        return new RealNumber(real * sum.real - vir * sum.vir, real * sum.vir + vir * sum.real);
    }
    
    public RealNumber calculationD(RealNumber B){
        RealNumber sum = sumOfTwoRealNumber(B);
        return new RealNumber(sum.real * sum.real - sum.vir * sum.vir, 2 * sum.real * sum.vir); 

    }

    @Override
    public String toString() {
        return real + " " + (vir > 0 ? ("+ " + vir) : ("- " + -vir)) + "i";
    }
    
}
