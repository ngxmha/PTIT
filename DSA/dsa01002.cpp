#include<bits/stdc++.h>

using namespace std;

int n, k, x[1001];

void next(){
	int i = k;
	while(i >= 1 && x[i] == n - k + i){
		i--;
	}
	if(i == 0){
		for(int j = 1; j <= k; j++){
			x[j] = j;
		}
	}
	else{
		x[i]++;
		for(int j = i + 1; j <= k; j++){
			x[j] = x[i] + j - i;
		}
	}
	for(int i = 1; i <= k; i++){
		cout << x[i] << " ";
	}
	cout << endl;
}

int main(){
	int t;
	cin >> t;
	while(t--){
		cin >> n >> k;
		for(int i = 1; i <= k; i++){
			cin >> x[i];
		}
		next();
	}
}