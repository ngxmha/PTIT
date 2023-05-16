#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main(){
	int t, n;
	cin >> t;
	while(t--){
		cin >> n;
		ll a[n];
		for(ll &x : a)
			cin >> x;
		int res = 0;
		for(int i = 0; i < n-1; i++){
			if(a[i] > a[i+1]){
				res = i + 1;
				break;
			}
		}
		cout << res << endl;
	}
}