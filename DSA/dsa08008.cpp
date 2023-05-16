#include<iostream>
#include<queue>
#define ll long long
using namespace std;

void testcase(){
	int n;
	cin >> n;
	queue<ll> q;
	q.push(1);
	while(1){
		ll tmp = q.front();
		q.pop();
		if(tmp % n == 0){
			cout << tmp << endl;
			return;
		}
		ll t;
		t = tmp * 10 + 0;
		if(t % n == 0){
			cout << t << endl;
			return;
		}
		q.push(t);
		t = tmp * 10 + 1;
		if(t % n == 0){
			cout << t << endl;
			return;
		}
		q.push(t);
	}
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
	