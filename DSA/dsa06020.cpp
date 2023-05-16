#include<bits/stdc++.h>
using namespace std;

main(){
	int t;
	cin >> t;
	while(t--){
		int n, x;
		cin >> n >> x;
		int a[n];
		for(int &x : a)
			cin >> x;
		if(binary_search(a, a+n, x))
			cout << "1";
		else 
			cout << "-1";
		cout << endl;
	}
}