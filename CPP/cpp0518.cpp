#include<bits/stdc++.h>

using namespace std;

struct NhanVien{
    string ma, name, gt, date, dc, mst, khd;
};

int k = 1;

void nhap(NhanVien &a){
    cin.ignore();
    string s = to_string(k++);
    a.ma = string(5 - s.size(), '0') + s;
    getline(cin, a.name);
    cin >> a.gt >> a.date;
    cin.ignore();
    getline(cin,a.dc);
    cin >> a.mst >> a.khd;
}

bool cmp(NhanVien a, NhanVien b){
    string y1 = a.date.substr(6) , y2 = b.date.substr(6);
    if(y1 != y2)
        return y1 < y2;
    int m1 = (a.date[0] - '0') * 10 + (a.date[1] - '0'), m2 = (b.date[0] - '0') * 10 + (b.date[1] - '0');
        if(m1 != m2)
            return m1 < m2;
    int d1 = (a.date[3] - '0') * 10 + (a.date[4] - '0'), d2 = (b.date[3] - '0') * 10 + (b.date[4] - '0'); 
        return m1 < m2;  
   
}

void sapxep(NhanVien ds[], int n){
    sort(ds,ds+n,cmp);
}

void inds(NhanVien ds[], int n){
    for(int i = 0; i < n; i++){
        cout << ds[i].ma << " " << ds[i].name << " " << ds[i].gt << " " << ds[i].date << " " << ds[i].dc << " " << ds[i].mst << " " << ds[i].khd << endl;
    }
}

int main(){
    struct NhanVien ds[50];
    int N,i;
    cin >> N;
    for(i = 0; i < N; i++) nhap(ds[i]);
    sapxep(ds, N);
    inds(ds, N);
    return 0;
}