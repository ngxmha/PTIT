package J04003;

public class Fraction{
	private long t, m;

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

        @Override
	public String toString(){
		long gcd = gcd(this.t, this.m);
		return (t/gcd) + "/" + (m/gcd);
	}
}

