#include<bits/stdc++.h>
using namespace std;

int binarysearch(int a[], int n, int x){
	int l = 0, r = n - 1;
	while(l <= r){
		int m = (l + r) / 2;
		if(a[m] == x)
			return m;
		else if(a[m] < x)
			l = m + 1;
		else
			r = m - 1;
	}
	return -1;
}

int main(){
	int t; cin >> t;
	while(t--){
		int n, x;
		cin >> n >> x;
		int a[n];
		for(int i = 0; i < n; i++)
			cin >> a[i];
		int m = binarysearch(a, n, x);
		if(m == -1)
			cout << "NO";
		else
			cout << binarysearch(a,n,x) + 1;
		cout << endl;
	}
}