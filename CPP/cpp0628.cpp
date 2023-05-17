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
	for(int i = 0; i < n; i++){
		ds[i].out();
		cout << endl;
	}
}