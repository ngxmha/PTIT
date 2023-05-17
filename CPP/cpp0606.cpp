#include<bits/stdc++.h>

using namespace std;

class NhanVien{
private:
	string ma, name, gt, date, add, mst, khd;
public:	
	friend istream& operator >> (istream& in, NhanVien &x){
		x.ma = "00001";
		getline(in, x.name);
		in >> x.gt >> x.date;
		in.ignore();
		getline(in, x.add);
		in >> x.mst >> x.khd;
		return in;
	}

	friend ostream& operator << (ostream& out, NhanVien x){
		out << x.ma << " " << x.name << " " << x.gt << " " << x.date << " " << x.add << " " << x.mst << " " << x.khd;
		return out;
	}
};

int main(){
    NhanVien a;
    cin >> a;
    cout << a;
    return 0;
}