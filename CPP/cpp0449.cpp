#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n, x;
		cin >> n >> x;
		int a[n];
		for(int &x : a)
			cin >> x;
		int ok = 0;
		sort(a, a + n);
		for(int y : a){
			if(binary_search(a, a+n, x+y)){
				ok = 1;
				cout << ok;
				break;
			}
		}
		if(!ok)
			cout << "-1";
		cout << endl;
	}
}