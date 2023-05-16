#include<bits/stdc++.h>
using namespace std;

int main(){
	int t, n;
	cin >> t;
	map<int,int> ma;
	while(t--){
		cin >> n;
		int a[n];
		int check = 0;
		for(int i = 0; i < n; i++){
			cin >> a[i];
			ma[a[i]]++;
		}
		for(int i = 0; i < n; i++){
			if(ma[a[i]] > 1){
				check = 1;
				cout << a[i];
				break;
			}
		}
		if(!check)
			cout << "NO";
		cout << endl;
		ma.clear();
	}
}