#include<bits/stdc++.h>
using namespace std;

int n, k, a[17], ok = 1;

void next(){
	int i = n;
	while(i >= 1 && a[i] == 1){
		a[i] = 0;
		i--;
	}
	if(i == 0)
		ok = 0;
	else 
		a[i] = 1;
}

bool check(int k){
	int cnt = 0;
	for(int i = 1; i <= n; i++){
		if(a[i])
			cnt++;
	}
	return cnt == k;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> k;
		while(ok){
			if(check(k)){
				for(int i = 1; i <= n; i++)
					cout << a[i];
				cout << endl;
			}
			next();
		}
		ok = 1;
	}
}