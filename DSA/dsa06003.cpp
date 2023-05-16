#include<bits/stdc++.h>
using namespace std;

main(){
	int t; 
	cin >> t;
	while(t--){
		int n; 
		cin >> n;
		int a[n];
		for(auto &x : a)
			cin >> x;
		int res = 0;
		for(int i = 0; i < n - 1; i++){
			int min_index = i;
			for(int j = i + 1; j < n; j++){
				if(a[j] <= a[min_index]){
					min_index = j;				
				}
			}
			if(a[i] > a[min_index]){
				swap(a[i], a[min_index]);
				res++;
			}
		}
		cout << res;
		cout << endl;
	}
}