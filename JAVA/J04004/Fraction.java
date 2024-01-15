package J04004;

public class Fraction{
	private long t, m;

	
	public Fraction(){
		t = 0;
		m = 1;
	}

	public Fraction(long t, long m){
		this.t = t;
		this.m = m;
	}

	public Fraction sumOfTwoFraction(Fraction a){
		Fraction f = new Fraction();
		f.t = t * a.m + m * a.t;
		f.m = m * a.m;
		return f; 
	}

	public Fraction sumOfTwoFraction(Fraction a, Fraction b){
		Fraction f = new Fraction();
		f.t = a.t * b.m + a.m * b.t;
		f.m = a.m * b.m;
		return f;
	}

	public long gcd(long a, long b){
		while(b != 0){
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	public String toString(){
		long gcd = gcd(t, m);
		return (t/gcd) + "/" + (m/gcd);
	}
}

