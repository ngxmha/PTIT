#include<bits/stdc++.h>

using namespace std;

class SinhVien{
private:
	string msv, name, lop, date;
	float gpa;
public:
	void nhap(){
		msv = "B20DCCN001";
		getline(cin, name);
		cin >> lop >> date >> gpa;
	}

	void xuat(){
		if(date[1] == '/')
			date = "0" + date;
		if(date[4] == '/')
			date.insert(3,"0");
		cout << msv << " " << name << " " << lop << " " << date << " " << fixed << setprecision(2) << gpa;
	}
};

int main(){
	SinhVien a;
	a.nhap();
	a.xuat();
	return 0;
}