#include<bits/stdc++.h>

using namespace std;

struct SinhVien{
	int stt;
	string msv, name, lop, email, dn;

	void nhap(){
		cin >> msv;
		cin.ignore();
		getline(cin, name);
		cin >> lop >> email >> dn;
	}

	void in(){
		cout << stt << " " << msv << " " << name << " " << lop << " " << email << " " << dn;
	}
};

bool cmp(SinhVien a, SinhVien b){
	return a.msv < b.msv;
}

int main(){
	int n;
	cin >> n;
	SinhVien ds[n];
	for(int i = 0; i < n; i++){
		ds[i].stt = i + 1;
		ds[i].nhap();
	}
	sort(ds, ds + n, cmp);
	int q;
	cin >> q;
	while(q--){
		string s;
		cin >> s;
		for(int i = 0; i < n; i++){
			if(ds[i].dn == s){
				ds[i].in();
				cout << endl;
			}
		}
	}
	 // ds[0].in();
}