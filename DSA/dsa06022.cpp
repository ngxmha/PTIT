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
		sort(a, a + n);
		if(a[0] == a[n - 1])
			cout << "-1";
		else {
			cout << a[0] << " ";
			for(int i = 1; i < n; i++){
				if(a[i] > a[0]){
					cout << a[i];
					break;
				}
			}
		}
		cout << endl;
	}
}