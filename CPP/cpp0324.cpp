#include<bits/stdc++.h>

using namespace std;

long long powmod(long long a, long long b, long long m){
	if(b == 0)	return 1;
	long long x = powmod(a, b/2, m);
	if(b % 2 == 0){
		return ((x % m) * (x % m)) % m;
	}
	else 
		return (a % m * ((x % m) * (x % m) % m)) % m; 
}


int main(){
	int t;
	cin >> t;
	while(t--){
		string a;
		cin >> a;
		long long b, m;
		cin >> b >> m;
		long long res = 0;
		for(int i = 0; i < a.size(); i++){
			res = res * 10 + a[i] - '0';
			res %= m;
		}
		cout << powmod(res, b, m) << endl;
	}
}

