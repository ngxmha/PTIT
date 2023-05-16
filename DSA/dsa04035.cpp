#include<bits/stdc++.h>
using namespace std;
#define ll long long 
long long MOD = 1e9 + 7;

long long power(long long n, long long k){
	if(k == 0)
		return 1;
	long long x = power(n, k / 2);
	if(k % 2 == 0)
		return (x % MOD * x % MOD) % MOD;
	else
		return  ((((x % MOD) * (x % MOD)) % MOD) * (n % MOD)) % MOD;
}

int main(){
	int n;
	ll k;
	while(cin >> n >> k){
		if(n == 0 && k == 0)
			return 0;
		cout << power(n, k);
		cout << endl;
	}
}