#include<bits/stdc++.h>
using namespace std;

main(){
	int t;
	cin >> t;
	while(t--){
		// int n;
		// cin >> n;
		// long long a[n];
		// for(long long &x : a)
		// 	cin >> x;
		// int b[10] = {0};
		// for(int i = 0; i < n; i++){
		// 	while(a[i]){
		// 		b[a[i] % 10] = 1;
		// 		a[i] /= 10;
		// 	}
		// }
		// for(int i = 0; i < 10; i++)
		// 	if(b[i])
		// 		cout << i << " ";
		int n; cin >> n;
		cin.ignore();
		string s;
		getline(cin, s);
		int b[10] = {0};
		for(int i = 0; i < s.size(); i++)
			if(isdigit(s[i]))
				b[s[i] - '0'] = 1;
		for(int i = 0; i < 10; i++)
			if(b[i])
				cout << i << " ";
		cout << endl;
	}
}