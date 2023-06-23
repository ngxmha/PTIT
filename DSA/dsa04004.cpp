
#include<iostream>
#include<math.h>
using namespace std;
#define ll long long

int n;
ll k;

void input(){
	cin >> n >> k;
}

ll power(int n){
	if(n == 0) 
		return 1;
	ll p = power(n / 2);
	if(n % 2 == 0)
		return p * p;
	return 2 * p * p;
}

int solve(int n, ll k){
	if(k == 1)
		return 1;
	ll tmp = power(n - 1);
	if(k == tmp)
		return n;
	if(k < tmp)
		return solve(n - 1, k);
	return solve(n - 1, k - tmp);
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		input();
		cout << solve(n, k) << endl;
	}
}
