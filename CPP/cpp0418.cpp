#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n, m;
		cin >> n >> m;
		int a[n], b[m];
		// map<int, int> mp;
		for(int &x : a){
			cin >> x;
		}
		for(int &x : b){
			cin >> x;	
		}	
		int c[100001];
		memset(c, 0, sizeof(c));
		for(int x : a){
			c[x] = 1;
		}
		for(int x : b){
			if(c[x] == 1)
				c[x] = 2;
			else if(c[x] == 0)
				c[x] = 1;
		}
		for(int i = 0; i < 100001; i++){
			if(c[i])
				cout << i << " ";
		}
		cout << endl;
		for(int i = 0; i < 100001; i++){
			if(c[i] == 2)
				cout << i << " ";
		}
		cout << endl;
	}
}

	// map<int, int> mp;
	// 	for(int &x : a){
	// 		cin >> x;
	// 	}
	// 	for(int &x : b){
	// 		cin >> x;
	// 	}
	// 	for(int x : a)
	// 		mp[x] = 1;
	// 	for(int x : b){
	// 		if(mp[x] == 1)
	// 			mp[x] = 2;
	// 	}
	// 	for(auto x : mp){
	// 		cout << x.first << " ";
	// 	}
	// 	cout << endl;
	// 	for(auto x : mp){
	// 		if(x.second == 2)
	// 			cout << x.first << " ";
	// 	}