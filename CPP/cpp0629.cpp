#include<bits/stdc++.h>

using namespace std;

class DN{
private:
	string ma, name;
	int soluong;
public:
	void in(){
		cin >> ma;
		cin.ignore();
		getline(cin, name);
		cin >> soluong;
	}

	void out(){
		cout << ma << " " << name << " " << soluong;
	}

	int getSoluong(){
		return soluong;
	}

	string getMa(){
		return ma;
	}
};

bool cmp(DN a, DN b){
	if(a.getSoluong() != b.getSoluong())
		return a.getSoluong() > b.getSoluong();
	return a.getMa() < b.getMa();
	
}

int main(){
	int n;
	cin >> n;
	DN ds[n];
	for(int i = 0; i < n; i++){
		ds[i].in();
	}
	sort(ds, ds + n, cmp);
	int q;
	cin >> q;
	while(q--){
		int a,b;
		cin >> a >> b;
		cout << "DANH SACH DOANH NGHIEP NHAN TU " << a  << " " << "DEN " << b << " SINH VIEN:" << endl;
		for(int i = 0; i < n; i++){
			if(ds[i].getSoluong() >= a && ds[i].getSoluong() <= b){
				ds[i].out();
				cout << endl;
			}
		}
	}
}