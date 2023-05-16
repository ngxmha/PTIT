#include<bits/stdc++.h>
using namespace std;

int first_pos(int a[], int n, int x){
	int l = 0, r = n - 1;
	int res = -1;
	while(l <= r){
		int m = (l+r)/2;
		if(a[m] == x){
			res = m;
			r = m - 1;
		}
		else if(a[m] < x)
			l = m + 1;
		else 
			r = m - 1;
	}
	return res;
}

int last_pos(int a[], int n, int x){
	int l = 0, r = n - 1;
	int res = -1;
	while(l <= r){
		int m = (l+r)/2;
		if(a[m] == x){
			res = m;
			l = m + 1;
		}
		else if(a[m] < x)
			l = m + 1;
		else 
			r = m - 1;
	}
	return res;
}

main(){
	int t;
	cin >> t;
	while(t--){
		// int n, x;
		// cin >> n >> x;
		// int a[n];
		// map<int,int> m;
		// for(int &y : a){
		// 	cin >> y;
		// 	m[y]++;
		// }
		// auto it = m.find(x);
		// if(it != m.end())
		// 	cout << (*it).second;
		// else 
		// 	cout << "-1";
		int n, x;
		cin >> n >> x;
		int a[n];
		for(int i = 0; i < n; i++)
			cin >> a[i];
		int fi = first_pos(a, n, x);
		int la = last_pos(a, n, x);
		if(fi != -1)
			cout << la - fi + 1;
		else if(fi == -1 && la == -1)
			cout << "-1";
		cout << endl;
	}
}