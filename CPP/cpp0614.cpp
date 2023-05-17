#include<bits/stdc++.h>

using namespace std;

class NhanVien{
private:
    string ma, name, gt, date, add, mst, khd;
    static int cnt;
public: 
    friend istream& operator >> (istream& in, NhanVien &x){
        cnt++;
        x.ma = string(5 - to_string(cnt).size(), '0') + to_string(cnt);
        in.ignore();
        getline(in, x.name);
        in >> x.gt >> x.date;
        in.ignore();
        getline(in, x.add);
        in >> x.mst >> x.khd;
        return in;
    }

    friend ostream& operator << (ostream& out, NhanVien x){
        out << x.ma << " " << x.name << " " << x.gt << " " << x.date << " " << x.add << " " << x.mst << " " << x.khd;
        out << endl;
        return out;
    }
};

int NhanVien :: cnt = 0;

int main(){
    NhanVien ds[50];
    int N,i;
    cin >> N;
    for(i=0;i<N;i++) cin >> ds[i];
    for(i=0;i<N;i++) cout << ds[i];
    return 0;
}