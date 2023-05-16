#include<bits/stdc++.h>
using namespace std;

bool cmp(pair<int,int> a, pair<int,int> b){
	if(abs(a.first) != abs(b.first))
		return abs(a.first) < abs(b.first);
	return a.second < b.second;
}

main(){
	int t;
	cin >> t;
	while(t--){
	// 	int n;
	// 	cin >> n;
	// 	int a[n];
	// 	for(auto &x : a)
	// 		cin >> x;
	// 	int res = INT_MAX;
	// 	for(int i = 0; i < n; i++){
	// 		for(int j = i + 1; j < n; j++){
	// 			if(abs(a[i] + a[j]) < abs(res)){
	// 				res = a[i] + a[j];
	// 			}
	// 		}
	// 	}
	// 	cout << res << endl;
	// }
		int n;
		cin >> n;
		vector<pair<int,int>> v(n);
		for(int i = 0; i < n; i++){
			int x;
			cin >> x;
			v[i].first = x;
			v[i].second = i;
		}
		sort(v.begin(), v.end(), cmp);
		int res, sum = INT_MAX, index;
		for(int i = 0; i < n - 1; i++){
			int temp = abs(v[i].first + v[i+1].first);
			if(temp < sum){
				sum = temp;
				res = v[i].first + v[i+1].first;
				index = min(v[i].second, v[i+1].second);
			}
			else if(temp == sum){
				if(index > min(v[i].second, v[i+1].second)){
					res = v[i].first + v[i+1].first;
					index = min(v[i].second, v[i+1].second);
				}
			}
		}
		cout << res << endl;
	}
}