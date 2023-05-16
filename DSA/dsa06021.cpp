#include<bits/stdc++.h>
using namespace std;

int Binary_search(vector<pair<int,int>> v, int x){
	int l = 0, r = v.size() - 1;
	while(l <= r){
		int m = (l+r)/2;
		if(v[m].first == x)
			return m;
		else if(v[m].first < x)
			l = m + 1;
		else
			r = m - 1;
	}
}



main(){
	int t;
	cin >> t;
	while(t--){
		int n, x;
		cin >> n >> x;
		int a[n];
		vector<pair<int,int>> v;
		for(int i = 0; i < n; i++){
			cin >> a[i];
			v.push_back({a[i], i});
		}
		sort(v.begin(), v.end());
		cout << v[Binary_search(v, x)].second + 1 << endl;
	}
}