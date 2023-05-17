#include<bits/stdc++.h>

using namespace std;

struct Hang{
	int ma;
	string ten,nhom;
	double mua, ban, loinhuan;
	
};

bool cmp(Hang a, Hang b){
	return a.loinhuan > b.loinhuan;
}

int main(){
	int n; cin >> n;
	Hang ds[n];
	for(int i = 0; i < n; i++){
		ds[i].ma = i + 1;
		cin.ignore();
		getline(cin , ds[i].ten);
		getline(cin , ds[i].nhom);
		cin >> ds[i].mua >> ds[i].ban;
		ds[i].loinhuan = ds[i].ban - ds[i].mua;
	}
	sort(ds , ds + n, cmp);
	for(int i = 0; i < n; i++){
		cout << ds[i].ma << " " << ds[i].ten << " " << ds[i].nhom << " " << fixed << setprecision(2) << ds[i].loinhuan;
		cout << endl;
	} 
}
