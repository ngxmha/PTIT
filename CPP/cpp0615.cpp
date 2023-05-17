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

    string getDate(){
        return date;
    }
};

bool cmp(NhanVien a, NhanVien b){
    string y1 = a.getDate().substr(6) , y2 = b.getDate().substr(6);
    if(y1 != y2) 
        return y1 < y2;
    string m1 = a.getDate().substr(0,2), m2 = b.getDate().substr(0,2);
    if(m1 != m2)
        return m1 < m2; 
    string d1 = a.getDate().substr(3,2), d2 = b.getDate().substr(3,2);
    return d1 < d2;

}

void sapxep(NhanVien a[], int n){
    sort(a, a + n, cmp);
}

int NhanVien :: cnt = 0;

int main(){
    NhanVien ds[50];
    int N,i;
    cin >> N;
    for(i=0;i<N;i++) cin >> ds[i];
        sapxep(ds, N);
    for(i=0;i<N;i++) cout << ds[i];
        return 0;
}