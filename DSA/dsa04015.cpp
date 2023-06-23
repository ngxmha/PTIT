#include<iostream>
#include<vector>
using namespace std;
#define ll long long

int N;
ll x;
vector<ll> a(N);

void input(){
	cin >> N >> x;
	for(int i = 0; i < N; i++){
		ll y;
		cin >> y;
		a.push_back(y);
	}
}

void floor(int l, int r){
	int res = -1;
	while(l <= r){
		int m = (l + r) / 2;
		if(a[m] <= x){
			l = m + 1;
			res = m + 1;
		}
		else {
			r = m - 1;
		}
	}
	cout << res << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		floor(0, N - 1);
		a.clear();
	}
}
