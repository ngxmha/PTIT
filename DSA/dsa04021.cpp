#include<bits/stdc++.h>
using namespace std;

long long f[100];

char binary_string(int n, long long k){
	if(k == 1)
		return '0';
	if(k == 2)
		return '1';
	if(k <= f[n-2])
		return binary_string(n - 2, k);
	return binary_string(n-1, k - f[n-2]);
}

int main(){
	int t, n;
	long long k;
	f[0] = 0, f[1] = 1;
	for(int i = 2; i <= 92; i++){
		f[i] = f[i-2] + f[i-1];
	}
	cin >> t;
	while(t--){
		cin >> n >> k;
		cout << binary_string(n, k) << endl;
	}
}