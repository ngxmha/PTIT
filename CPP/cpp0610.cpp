#include<bits/stdc++.h>

using namespace std;

class PhanSo{
private:
	long long tu, mau;
public:
	// PhanSo();

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

	friend PhanSo operator + (PhanSo x, PhanSo y){
		PhanSo tong(1,1);
		tong.tu = x.tu * y.mau + x.mau * y.tu;
		tong.mau = x.mau * y.mau;
		long long z = __gcd(tong.tu, tong.mau);
		tong.tu /= z; tong.mau /= z;
		return tong;
	}
};

int main() {
	PhanSo p(1,1), q(1,1);
	cin >> p >> q;
	cout << p + q;
	return 0;
}