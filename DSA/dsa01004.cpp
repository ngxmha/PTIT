#include<bits/stdc++.h>

using namespace std;

int n, k, x[16], ok = 1;

void begin(){
	for(int i = 1; i <= k; i++){
		x[i] = i;
	}
}

void next(){
	int i = k;
	while(i >= 1 && x[i] == n - k + i){
		i--;
	}
	if(i == 0)
		ok = 0;
	else{
		x[i]++;
		for(int j = i+1; j <= k; j++){
			x[j] = x[i] + j - i;
		}
	}
}
int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> k;
		begin();
		while(ok){
			for(int i = 1; i <= k; i++){
				cout << x[i];
			}
			cout << " ";
			next();
		}
		cout << endl;
		ok = 1;
	}
}