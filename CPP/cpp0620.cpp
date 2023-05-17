#include<bits/stdc++.h>

using namespace std;


class SV{
private:
	string msv, name, lop, email;
	// static int cnt;
public:
	friend istream& operator >> (istream& in, SV &a){		// cnt++;
		cin >> a.msv;
		cin.ignore();
		getline(cin, a.name);
		cin >> a.lop;
		cin >> a.email;
	}

	void out(){
		cout << msv << " " << name << " " << lop << " " << email << endl;
	}

	string getLop(){
		return lop;
	}

	string getMsv(){
		return msv;
	}
};

// int SinhVien :: cnt = 0;

bool cmp(SV a, SV b){
	if(a.getLop() != b.getLop())
		return a.getLop() < b.getLop();
	return a.getMsv() < b.getMsv();
}

int main(){
	SV ds[1000];
	int m = 0;
	while(cin >> ds[m]){
		m++;
	}
	sort(ds, ds + m, cmp);
	for(int i = 0; i < m; i++){
		ds[i].out();
	}
}