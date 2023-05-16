#include<bits/stdc++.h>
using namespace std;
#define MOD 1000000007

long long reverse_num(long long n){
	long long m = 0;
	while(n){
		m = m * 10 + n % 10;
		n /= 10;
	}
	return m;
}

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
	int t;
	cin >> t;
	while(t--){
		long long n;
		cin >> n;
		cout << power(n, reverse_num(n));
		cout << endl;
	}
}