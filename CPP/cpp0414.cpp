#include<bits/stdc++.h>

using namespace std;

int main(){
	int t; cin >> t;
	while(t--){
		int n; cin >> n;
		set<int> se;
		for(int i = 0; i < n; i++){
			long long x;
			cin >> x;
			while(x){
				se.insert(x%10);
				x /= 10;
			}
		}
		for(int x : se){
			cout << x << " ";
		}
		cout << endl;
	}
}