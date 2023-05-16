#include<bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	map<int,int> mp;
	while(t--){
		int n, k;
		cin >> n >> k;
		int a[n];
		for(int &x : a){
			cin >> x;
			mp[x]++;
		}
		long long cnt = 0;
		for(int i = 0; i < n; i++){
			cnt += mp[k - a[i]];
			if(k == 2 * a[i]){
				cnt--;
			}
		}
		cout << cnt / 2 << endl;
		mp.clear();
	}
}