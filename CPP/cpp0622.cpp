#include<bits/stdc++.h>

using namespace std;


class SV{
private:
	string msv, name, lop, email;
	// static int cnt;
public:
	void in(){
		// cnt++;
		cin >> msv;
		cin.ignore();
		getline(cin, name);
		cin >> lop;
		cin >> email;
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
	int n;
	cin >> n;
	SV ds[n];
	for(int i = 0; i < n; i++){
		ds[i].in();
	}
	int q;
	cin >> q;
	while(q--){
		string s;
		cin >> s;
		cout << "DANH SACH SINH VIEN LOP " << s << ":" << endl; 
		for(int i = 0; i < n; i++){
			if(ds[i].getLop() == s)
				ds[i].out();
		}
	}
}