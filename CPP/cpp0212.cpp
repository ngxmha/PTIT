#include<bits/stdc++.h>

using namespace std;

const int mod = 1000000007;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n,x;
		cin >> n >> x;
		int a[n];
		for(int i = 0; i < n; i++){
			cin >> a[i];
		}
		long long sum = 0;
		long long res = 1;
		for(int i = n-1; i >= 0; i--){
			sum += a[i] * res;
			sum %= mod;
			res *= x; 
			res %= mod;
		}
		cout << sum << endl;
	}
}