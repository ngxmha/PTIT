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
		sort(a, a+n);
		int l, r;
		if(n % 2 == 0){
			l = 0; r = n / 2;
			while(l < n / 2){
				cout << a[l] << " " << a[r] << " ";
				l++; r++;
			}
		}
		else{
			l = 0; r = n / 2 + 1;
			while(l < n / 2 + 1){
				if(l == n / 2){
					cout << a[l];
					break;
				}
				cout << a[l] << " " << a[r] << " ";
				l++; r++;
			}
		}
		cout << endl;
	}
}