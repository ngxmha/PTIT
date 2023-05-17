#include<bits/stdc++.h>

using namespace std;

class PhanSo{

private:
	long long tu, mau;
public:
	
	PhanSo();

	PhanSo(long long t, long long m){
		tu = t;
		mau = m;
	}

	friend istream& operator >> (istream& in, PhanSo &x){
		in >> x.tu >> x.mau;
		return in;
	}

	friend ostream& operator << (ostream& out, PhanSo x){
		out << x.tu << "/" << x.mau;
		return out;
	}

	void rutgon();
};

void PhanSo::rutgon(){
	long long i =  __gcd(tu, mau);
	tu /= i;
	mau /= i;
}

int main() {
	PhanSo p(1,1);
	cin >> p;
	p.rutgon();
	cout << p;
	return 0;
}
