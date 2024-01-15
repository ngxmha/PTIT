package J04014;

public class Fraction {
    private long t, m;
    
    public Fraction(){
        t = 0;
        m = 1;
    }
    
    public Fraction(long t, long m){
        this.t = t;
        this.m = m;
    }
    
    public long gcd(long a, long b){
        while(b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public Fraction calculationC(Fraction f){
        Fraction C = new Fraction();
        C.t = (long)Math.pow(t * f.m + f.t * m, 2);
        C.m = (long)Math.pow(m * f.m, 2);
        long g = gcd(C.t, C.m);
        C.t /= g;
        C.m /= g;
        return C;
    }
    
    public Fraction calculationD(Fraction f1, Fraction f2){
        Fraction D = new Fraction();
        D.t = t * f1.t * f2.t;
        D.m = m * f1.m * f2.m;
        long g = gcd(D.t, D.m);
        D.t /= g;
        D.m /= g;
        return D;
    }

    @Override
    public String toString() {
        return t + "/" + m;
    }
}
