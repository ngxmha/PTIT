#include<bits/stdc++.h>
using namespace std;

// int cnt[100001] = {0};

main(){
	int t;
	cin >> t;
	while(t--){
		int n, m;
		cin >> n >> m;
		int a[n], b[m];
		// int min_value = INT_MAX, max_value = INT_MIN;
		map<int,int> mp;
		for(int &x : a){
			cin >> x;
			mp[x] = 1;
	// 		min_value = min(x, min_value);
	// 		max_value = max(x, max_value);
		}
		for(int &x : b){
			cin >> x;
			mp[x]++;
	// 		min_value = min(x, min_value);
	// 		max_value = max(x, max_value);
		}
	// 	for(int i = min_value; i <= max_value; i++){
	// 		if(cnt[i])
	// 			cout << i << " ";
	// 	}
	// 	cout << endl;
	// 	for(int i = min_value; i <= max_value; i++){
	// 		if(cnt[i] == 2)
	// 			cout << i << " ";
	// 	}
	// 	cout << endl;
	// 	memset(cnt, 0, sizeof(cnt));
		for(auto x : mp){
			if(x.second)
				cout << x.first << " ";
		}
		cout << endl;
		for(auto x : mp){
			if(x.second == 2)
				cout << x.first << " ";
		}
		cout << endl;
		mp.clear();
	}
}