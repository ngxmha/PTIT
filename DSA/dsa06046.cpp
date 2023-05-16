#include<bits/stdc++.h>
using namespace std;

int min_difference(int a[], int n){
	sort(a, a+n);
	int min_di = INT_MAX;
	for(int i = 0; i < n-1; i++){
		min_di = min(min_di, a[i+1] - a[i]);
	} 
	return min_di;
}

int main(){
	int t, n;
	cin >> t;
	while(t--){
		cin >> n;
		int a[n];
		for(int i = 0; i < n; i++){
			cin >> a[i];
		}
		cout << min_difference(a, n) << endl;
	}
}