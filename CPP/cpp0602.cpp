#include<bits/stdc++.h>

using namespace std;

class SinhVien{
private:
	string msv, name, lop, date;
	float gpa;
public:
	friend istream& operator >> (istream& in, SinhVien &a){
		a.msv = "B20DCCN001";
		getline(in, a.name);
		in >> a.lop >> a.date >> a.gpa;
		return in;
	}

	friend ostream& operator << (ostream& out, SinhVien a){
		if(a.date[1] == '/')
			a.date = "0" + a.date;
		if(a.date[4] == '/')
			a.date.insert(3,"0");
		out << a.msv << " " << a.name << " " << a.lop << " " << a.date << " " << fixed << setprecision(2) << a.gpa;
		return out;
	}
};

int main(){
	SinhVien a;
	cin >> a;
	cout << a;
	return 0;
}