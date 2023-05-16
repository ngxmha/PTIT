#include<bits/stdc++.h>
using namespace std;

int first_pos(int a[], int n, int x){
	int res = -1;
	int l = 0, r = n-1;
	while(l <= r){
		int m = (l+r)/2;
		if(a[m] == x){
			res = m;
			r = m-1;
		}
		else if(a[m] < x)
			l = m+1; 
		else
			r = m-1;
	}
	return res;
}

int last_pos(int a[], int n, int x){
	int res = -1;
	int l = 0, r = n-1;
	while(l <= r){
		int m = (l+r)/2;
		if(a[m] == x){
			res = m;
			l = m+1;
		}
		else if(a[m] < x)
			l = m+1;
		else
			r = m-1;
	}
	return res;
}

int main(){
	int t, n;
	cin >> t;
	while(t--){
		cin >> n;
		int a[n];
		for(int &x : a)
			cin >> x;
		int i = first_pos(a, n, 0), j = last_pos(a, n, 0);
		if(i == -1)
			cout << "0";
		else 
			cout << j - i + 1;
		cout << endl;
	}
}