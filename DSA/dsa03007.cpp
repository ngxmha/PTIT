#include <iostream>
#include<queue>
using namespace std;
#define ll long long

int N;
priority_queue<int> q1;
priority_queue<int, vector<int>, greater<int> > q2;

void input(){
    cin >> N;
    for(int i = 1; i <= N; i++){
        int x;
        cin >> x;
        q1.push(x);
    }
    for(int i = 1; i <= N; i++){
        int x;
        cin >> x;
        q2.push(x);
    }
}

void solve(){
    ll sum = 0;
    while(!q1.empty()){
        sum += q1.top() * q2.top();
        q1.pop();
        q2.pop();
    }
    cout << sum << endl;
}

int main(){
    // freopen("Input", "r", stdin);
    int t;  cin >> t;
    while(t--){
        input();
        solve();
    }
}
