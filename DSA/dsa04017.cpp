#include<bits/stdc++.h>
using namespace std;
#define ll long long

int solve(ll a[], ll b[], int n){
	int i = 0, j = 0;
	while(i < n && j < n-1){
		if(a[i] == b[j]){
			i++; j++;
		}
		else
			return i;
	}
}

int main(){
	int t, n;
	cin >> t;
	while(t--){
		cin >> n;
		long long a[n];
		for(int i = 0; i < n; i++){
			cin >> a[i];
		}
		int res = -1;
		for(int i = 0; i < n-1; i++){
			int x;
			cin >> x;
			if(x != a[i] && res == -1){
				res = i + 1;
			}
		}
		if(res == -1)
			cout << n;	
		else
			cout << res;
		cout << endl;
	}
}