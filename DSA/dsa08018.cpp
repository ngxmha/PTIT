#include<iostream>
#include<cmath>
#include<queue>
#define ll long long
using namespace std;

void testcase(){
	int n;
	cin >> n;
	queue<ll> q;
	q.push(6);
	q.push(8);
	vector<ll> v;
	ll power = pow(10, n);
	while(!q.empty()){
		ll tmp = q.front();
		v.push_back(tmp);
		q.pop();
		ll t;
		t = tmp * 10 + 6;
		if(t < power)
			q.push(t);
		else
			break;
		t = tmp * 10 + 8;
		if(t < power)
			q.push(t);
		else
			break;
	}
	while(!q.empty()){
		v.push_back(q.front());
		q.pop();
	}
	cout << v.size() << endl;
	for(int i = 0; i < v.size(); i++)
		cout << v[i] << " ";
	cout << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	// freopen("Outputc++.out", "w", stdout);
	int t;	cin >> t;
	while(t--){
		testcase();
	}
}
