#include<bits/stdc++.h>

using namespace std;

string chuanhoa(string s){
	stringstream ss(s);
	string token;
	string s1 = "";
	while(ss >> token){
		s1 += toupper(token[0]);
	}
	return s1;
}

int cnt = 0;

class GV{
private:
	string name, sub, ma;
public:
	void in(){
		cnt++;
		getline(cin, name);
		getline(cin, sub);
		ma = "GV" + string(2 - to_string(cnt).size(), '0') + to_string(cnt);
	}

	void out(){
		cout << ma << " " << name << " " << chuanhoa(sub);
	}

	string getTen(){
		vector<string> v;
		stringstream ss(name);
		string token;
		while(ss >> token){
			v.push_back(token);
		}
		return v[v.size() - 1];
	}

	string getMa(){
		return ma;
	}

	string getSub(){
		return sub;
	}
};

bool cmp(GV a, GV b){
	if(a.getTen() != b.getTen())
		return a.getTen() < b.getTen();
	return a.getMa() < b.getMa();
}

int main(){
	int n;
	cin >> n;
	cin.ignore();
	GV ds[n];
	for(int i = 0; i < n; i++){
		ds[i].in();
	}
	// sort(ds, ds + n, cmp);
	// for(int i = 0; i < n; i++){
	// 	ds[i].out();
	// 	cout << endl;
	// }
	int q;
	cin >> q;
	cin.ignore();
	while(q--){
		string s;
		getline(cin, s);
		string s1 = chuanhoa(s);
		cout << "DANH SACH GIANG VIEN BO MON " << s1 << ":" << endl;
		for(int i = 0; i < n; i++){
			if(chuanhoa(ds[i].getSub()) == s1){
				ds[i].out();
				cout << endl;
			}
		}

	}
}