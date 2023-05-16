#include<bits/stdc++.h>
using namespace std;

main(){
	int t;
	cin >> t;
	while(t--){
		int n, m;
		cin >> n >> m;
		int a[n], b[m];
		for(int &x : a)
			cin >> x;
		for(int &x : b)
			cin >> x;
		auto max_pos = max_element(a, a+n);
		auto min_pos = min_element(b, b+m);
		cout << (long long)(*max_pos) * (*min_pos);
		cout << endl;
	}
}