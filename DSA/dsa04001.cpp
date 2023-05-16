#include<bits/stdc++.h>
using namespace std;
#define MOD 1000000007

long long power(int n, long long k){
	if(k == 0)
		return 1;
	long long x = power(n, k / 2);
	if(k % 2 == 0)
		return (x % MOD * x % MOD) % MOD;
	else
		return  ((((x % MOD) * (x % MOD)) % MOD) * (n % MOD)) % MOD;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		long long k;
		cin >> n >> k;
		cout << power(n, k);
		cout << endl;
	}
}