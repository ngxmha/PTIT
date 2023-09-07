#include <iostream>
#include<queue>
using namespace std;
#define ll long long
const int MOD = 1e9 + 7;

int N;
priority_queue<int, vector<int>, greater<int> > q1;

void input(){
    cin >> N;
    for(int i = 1; i <= N; i++){
        int x;
        cin >> x;
        q1.push(x);
    }
}

void solve(){
    ll opt = 0;
    while(q1.size() > 1){
        int a = q1.top();
        q1.pop();
        int b = q1.top();
        q1.pop();
        int c = (a + b) % MOD;
        opt += c;
        opt %= MOD;
        q1.push(c);
    }
    q1.pop();
    cout << opt << endl;
}

int main(){
    // freopen("Input", "r", stdin);
    int t;  cin >> t;
    while(t--){
        input();
        solve();
    }
}
