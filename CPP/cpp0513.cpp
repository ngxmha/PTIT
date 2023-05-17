#include<bits/stdc++.h>

using namespace std;

struct SinhVien{
	string name,lop,date;
	float gpa;
};

void nhap(SinhVien a[], int n){
	for(int i = 0; i < n; i++){
		cin.ignore();
		getline(cin,a[i].name);
		cin >> a[i].lop >> a[i].date >> a[i].gpa;
	}
}

void in(SinhVien a[], int n){
	for(int i = 0; i < n; i++){
		cout << "B20DCCN";
		string s = to_string(i+1);
		s = string(5 - s.size() , '0') + s;		
		cout << s << " ";
		cout << a[i].name << " " << a[i].lop << " ";
		if(a[i].date[1] == '/')
			a[i].date = "0" + a[i].date;
		if(a[i].date[4] == '/')
			a[i].date.insert(3,"0");
		cout << a[i].date << " " << fixed << setprecision(2) << a[i].gpa << endl;
	}
}

int main(){
    struct SinhVien ds[50];
    int N;
    cin >> N;
    nhap(ds, N);
    in(ds, N);
    return 0;
}