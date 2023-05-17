#include<bits/stdc++.h>

using namespace std;

struct SinhVien{
    string msv, name, lop;
    float s1, s2, s3;
};

void nhap(SinhVien &a){
    cin.ignore();
    cin >> a.msv;
    cin.ignore();
    getline(cin , a.name);
    cin >> a.lop >> a.s1 >> a.s2 >> a.s3;
}
bool cmp(SinhVien a, SinhVien b){
    return a.msv < b.msv;
}

void sap_xep(SinhVien a[], int n){
    sort(a, a + n, cmp);
}

void in_ds(SinhVien a[], int n){
    for(int i = 0; i < n; i++){
        cout << i + 1 << " " << a[i].msv << " " << a[i] .name << " " << a[i].lop << " " << fixed << setprecision(1) << a[i].s1 << " " << a[i].s2 << " " << a[i].s3 << endl;
    }
}


int main(){
    int n;
    cin >> n;
    struct SinhVien *ds = new SinhVien[n];
    for(int i = 0; i < n; i++) {
    	nhap(ds[i]);
	}
	sap_xep(ds, n);
    in_ds(ds,n);
    return 0;
}