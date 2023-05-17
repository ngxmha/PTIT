#include<bits/stdc++.h>

using namespace std;


class SV{
private:
	string msv, name, lop, email;
	// static int cnt;
public:
	// friend istream& operator >> (istream& cin, SV &a)
	void in(){ 		// cnt++;
		cin >> msv;
		cin.ignore();
		getline(cin, name);
		cin >> lop;
		cin >> email;
		// return cin;	
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
	return a.getMsv() < b.getMsv();
}

int main(){
	SV ds[1000];
	int m = 0;
	while(ds[m].in()){
		// ds[m].in();
		m++;
	}
	sort(ds, ds + m, cmp);
	for(int i = 0; i < m; i++){
		ds[i].out();
	}
}