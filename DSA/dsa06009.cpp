#include<bits/stdc++.h>
using namespace std;

main(){
	int t;
	cin >> t;
	while(t--){
		int n, k;
		cin >> n >> k;
		int a[n];
		map<int,int> m;
		for(int &x : a){
			cin >> x;
			m[x]++;
		}
		int res = 0;
		for(int i = 0; i < n; i++){
			if(m[k - a[i]]){
				if(a[i] == k - a[i])
					res += m[a[i]] - 1;
				else
					res += m[k-a[i]];
			}
		}
		cout << res/2 << endl;
	}
}