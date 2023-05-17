#include<bits/stdc++.h>

using namespace std;

bool nt(int n){
	for(int i = 2; i <= sqrt(n); i++){
		if(n%i == 0) 
			return false;
	}
	return n>1;
}

int sang(int l, int r){
	int a[r-l+1];
	for(int i = 0; i < r - l + 1; i++){
		a[i] = 1;
	}
	for(int i = 2; i <= sqrt(r); i++){
		for(int j = max(i*i, (l+i-1)/i*i); j <= r; j += i){
			a[j-l] = 0;
		}
	}
	int cnt = 0;
	for(int i = max(l,2); i <= r; i++){
		if(a[i-l])
			cnt++;
	}
	return cnt;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		int l,r;
		cin >> l >> r;
		// cout << sang(l,r);
		int cnt = 0;
		for(int i = l; i <= r; i++){
			if(nt(i))
				cnt++;
		}
		cout << cnt << endl;
	}
}