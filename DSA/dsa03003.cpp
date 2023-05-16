#include<iostream>
#include<algorithm>
using namespace std;
#define ll long long
int mod = 1e9 + 7;

void testcase(){
	int n;
	cin >> n;
	int a[n];
	for(int i = 0; i < n; i++){
		cin >> a[i];
	}
	sort(a, a + n);
	ll res = 0;
	for(int i = 0; i < n; i++){
		res += ((a[i] % mod) * (i % mod)) % mod;
		res %= mod;
	}
	cout << res << "\n";
}

int main(){
	int t;
	cin >> t;
	while(t--){
		testcase();
	}
}