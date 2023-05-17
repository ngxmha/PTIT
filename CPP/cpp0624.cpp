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
	cin.ignore();
	while(q--){
		string s;
		getline(cin, s);
		for(int i = 0; i < s.size(); i++){
			s[i] = toupper(s[i]);
		}
		cout << "DANH SACH SINH VIEN NGANH " << s << ":" << endl; 
		string s1 = "DC";
		stringstream ss(s);
		string token;
		while(ss >> token){
			s1 += token[0];
		}
		// cout << s1 << " ";
		if(s1 == "DCCNTT")
			s1 = "DCCN";
		else if(s1 == "DCATTT")
			s1 = "DCAT";
		for(int i = 0; i < n; i++){
			if(s1 == "DCCN" || s1 == "DCAT"){
				if(ds[i].getLop()[0] != 'E' && ds[i].getMsv().substr(3,4) == s1)
					ds[i].out();
			}
			else {
				if(ds[i].getMsv().substr(3,4) == s1)
					ds[i].out();
			}
		}
	}
}