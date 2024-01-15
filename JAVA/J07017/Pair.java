package J07017;

public class Pair<T, U> {
    
    private T t;
    private U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }
    
    public boolean check(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) 
                return false;
        }
        return true;
    }
    
    public boolean isPrime() {
        return check((Integer)t) && check((Integer)u);
    }
 
    @Override
    public String toString() {
        return t + " " + u;
    }
}
