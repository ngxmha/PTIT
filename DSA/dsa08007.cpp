#include<iostream>
#include<queue>
#include<string>
#define ll long long
using namespace std;

void testcase(){
	ll n;
	cin >> n;
	queue<ll> q;
	q.push(1);
	int cnt = 0;
	while(1){
		ll tmp = q.front();
		q.pop();
		cnt++;
		if(tmp * 10 + 0 > n)
			break;
		q.push(tmp * 10 + 0);
		if(tmp * 10 + 1 > n)
			break;
		q.push(tmp * 10 + 1);
	}
	cnt += q.size();
	cout << cnt << endl;
}

int main(){
	freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
