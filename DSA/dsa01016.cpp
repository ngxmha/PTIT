#include <iostream>
using namespace std;

int n, x[11], cnt;
bool check;


void next(){
    int i = cnt;
    while(x[i] == 1){
        i--;
    }

    if(i == 0){
        check = false;
    }
    else{
        x[i]--;
        int j = cnt - i + 1;
        cnt = i;
        int k = j / x[i];
        int l = j % x[i];
        if(k){
            while(k--){
                cnt++;
                x[cnt] = x[i];
            }
        }
        if(l){
            cnt++;
            x[cnt] = l;
        }
    }
}

void begin(){
    cin >> n;
    check = true;
    x[1] = n;
    cnt = 1;
}

void solve(){
    while(check){
        cout << "(";
        for(int i = 1; i < cnt; i++){
            cout << x[i] << " ";
        }
        cout << x[cnt] << ") ";
        next();
    }
    cout << endl;
}

int main(){
    // freopen("Input", "r", stdin);
    int t;  cin >> t;
    while(t--){
        begin();
        solve();
    }
}
