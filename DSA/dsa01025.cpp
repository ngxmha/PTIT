#include<bits/stdc++.h>
using namespace std;

int n, k, a[16], b[16], ok = 1;

void begin(){
	for(int i = 1; i <= k; i++)
		a[i] = i;
}

void next(){
	int i = k;
	while(i >= 1 && a[i] == n - k + i)
		i--;
	if(i == 0)
		ok = 0;
	else {
		a[i]++;
		for(int j = i+1; j <= k; j++)
			a[j] = a[j-1] + 1;
	}
}

main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> k;
		begin();
		int m = 65;
		for(int i = 0; i < 16; i++){
			b[i] = m++;
		}
		while(ok){
			for(int i = 1; i <= k; i++){
				cout << (char)b[a[i]-1];
			}
			cout << endl;
			next();
		}
		ok = 1;
	}
}