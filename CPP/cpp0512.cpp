#include<bits/stdc++.h>

using namespace std;

#define ll long long

ll gcd(ll a, ll b){
	while(b){
		ll r = a % b;
		a = b;
		b = r;
	}
	return a;
}

ll lcm(ll a, ll b){
	return a * b / gcd(a,b);
}

struct PhanSo{
	ll tu,mau;

	PhanSo operator + (PhanSo other){
		PhanSo tong;
		tong.tu = tu * other.mau + other.tu * mau;
		tong.mau = mau * other.mau;
		return tong;
	} 

	friend PhanSo operator * (PhanSo a, PhanSo b){
		PhanSo tich;
		tich.tu = a.tu * b.tu;
		tich.mau = a.mau * b.mau;
		return tich;
	}
};

void rutgon(PhanSo &a){
	ll m = gcd(a.tu,a.mau);
	a.tu /= m;
	a.mau /= m; 
}

void process(PhanSo a, PhanSo b){
	PhanSo c = a+b;
	rutgon(c);
	c.tu *= c.tu; c.mau *= c.mau;
	cout << c.tu << "/" << c.mau << " ";
	PhanSo d = a * b * c;
	rutgon(d);
	cout << d.tu << "/" << d.mau;
	cout << endl;
}

int main() {
	int t;
	cin >> t;
	while (t--) {
		PhanSo A;
		PhanSo B;
		cin >> A.tu >> A.mau >> B.tu >> B.mau;
		process(A, B);
	}
}