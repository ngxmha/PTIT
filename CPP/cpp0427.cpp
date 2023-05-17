#include<bits/stdc++.h>

using namespace std;

int main(){
	int t;
	cin >> t;
	while(t--){
		int n;
		cin >> n;
		int a[n];
		for(int &x : a)
			cin >> x;
		for(int i = 0; i < n - 1; i++){
			if(a[i+1] != 0 && a[i+1] == a[i]){
				a[i] *= 2;
				a[i+1] = 0;
			}
		}
		for(int x : a){
			if(x > 0)
				cout << x << " ";
		}
		for(int x : a)
			if(x == 0)
				cout << x << " ";
		cout << endl;
	}
}