#include<bits/stdc++.h>

using namespace std;

class SinhVien{
private:
	string msv, name, lop, date;
	float gpa;
	static int cnt;
public:
	friend istream& operator >> (istream& in, SinhVien &x){
		cnt++;
		in.ignore();
		x.msv = "B20DCCN" + string(3 - to_string(cnt).size(), '0') + to_string(cnt);
		getline(in, x.name);
		in >> x.lop >> x.date >> x.gpa;
		return in;
	}

	friend ostream& operator << (ostream& out, SinhVien x){
		if(x.date[1] == '/')
			x.date = "0" + x.date;
		if(x.date[4] == '/')
			x.date.insert(3,"0");
		out << x.msv << " " << x.name << " " << x.lop << " " << x.date << " " << fixed << setprecision(2) << x.gpa;
		out << endl;
		return out;
	}
};

int SinhVien::cnt = 0;

int main(){
    SinhVien ds[50];
    int N, i;
    cin >> N;
    for(i=0;i<N;i++){
        cin >> ds[i];
    }
    for(i=0;i<N;i++){
        cout << ds[i];
    }
    return 0;
}