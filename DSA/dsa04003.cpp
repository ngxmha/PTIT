#include<iostream>
using namespace std;
#define ll long long
const int MOD = 123456789;
ll n;

long long power(int k, ll n){
	if(n == 0)
		return 1;
	long long p = power(2, n / 2);
	if(n % 2 == 0)
		return ((p % MOD) * (p % MOD)) % MOD;
	return (2 * (p % MOD) * (p % MOD)) % MOD;
}

void solve(){
	cin >> n;
	cout << power(2, n - 1)  << endl;
}

int main(){
	// freopen("Inputc++.in", "r", stdin);
	int t;	cin >> t;
	while(t--){
		solve();	
	}
}
	