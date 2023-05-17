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
        x.msv = "B20DCCN" + string(3 - to_string(cnt).size(), '0') + to_string(cnt);
        scanf("\n");
        getline(in, x.name);
        in >> x.lop >> x.date >> x.gpa;
        return in;
    }
    friend ostream& operator << (ostream& out, SinhVien x){
        out << x.msv << " ";
        stringstream ss(x.name);
        string token;
        while(ss >> token){
            token[0] = toupper(token[0]);
            for(int i = 1; i < token.size(); i++){
                token[i] = tolower(token[i]);
            }
            out << token << " ";
        }
        out << x.lop << " ";
        if(x.date[1] == '/')
            x.date = "0" + x.date;
        if(x.date[4] == '/')
            x.date.insert(3, "0");
        out << x.date << " " << fixed << setprecision(2) << x.gpa << endl;
        return out;
    }

    float getGPA(){
        return gpa;
    }
};

int SinhVien :: cnt = 0;

bool cmp(SinhVien a, SinhVien b){
    return a.getGPA() > b.getGPA();
}

void sapxep(SinhVien ds[], int n){
    sort(ds, ds + n, cmp);
}

int main(){
    SinhVien ds[50];
    int N, i;
    cin >> N;
    for(i=0;i<N;i++){
        cin >> ds[i];
    }
    sapxep(ds, N);
    for(i=0;i<N;i++){
        cout << ds[i];
    }
    return 0;
}